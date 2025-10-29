package one_test.five.cache;

import one_test.five.contact.Prototype;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.net.URL;
import java.util.*;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public class PrototypeRegistry {
    private static final Map<String, Prototype> PROTOTYPE_MAP = new Hashtable<>();
    private static final String BASE_PACKAGE = "five";

    // 静态初始化块，程序启动时自动扫描并加载所有Prototype实现类
    static {
        try {
            scanAndLoadPrototypes();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 扫描并加载所有Prototype实现类
    private static void scanAndLoadPrototypes() throws Exception {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        Enumeration<URL> resources = classLoader.getResources(BASE_PACKAGE.replace('.', '/'));
        
        while (resources.hasMoreElements()) {
            URL resource = resources.nextElement();
            if (resource.getProtocol().equals("file")) {
                scanDirectory(new File(resource.getFile()), BASE_PACKAGE);
            } else if (resource.getProtocol().equals("jar")) {
                scanJarFile(resource);
            }
        }
    }

    // 扫描目录
    private static void scanDirectory(File directory, String packageName) throws Exception {
        if (!directory.exists()) {
            return;
        }

        File[] files = directory.listFiles();
        if (files == null) {
            return;
        }

        for (File file : files) {
            if (file.isDirectory()) {
                scanDirectory(file, packageName + "." + file.getName());
            } else if (file.getName().endsWith(".class")) {
                String className = packageName + "." + file.getName().substring(0, file.getName().length() - 6);
                registerPrototype(className);
            }
        }
    }

    // 扫描jar文件
    private static void scanJarFile(URL resource) throws IOException, Exception {
        String jarPath = resource.getPath().substring(5, resource.getPath().indexOf("!"));
        JarFile jar = new JarFile(jarPath);
        Enumeration<JarEntry> entries = jar.entries();

        while (entries.hasMoreElements()) {
            JarEntry entry = entries.nextElement();
            String entryName = entry.getName();
            
            if (entryName.endsWith(".class") && entryName.startsWith(BASE_PACKAGE.replace('.', '/'))) {
                String className = entryName.replace('/', '.').substring(0, entryName.length() - 6);
                registerPrototype(className);
            }
        }
        jar.close();
    }

    // 注册原型类
    private static void registerPrototype(String className) {
        try {
            Class<?> clazz = Class.forName(className);

            // 检查是否实现了Prototype接口，并且不是接口，也不是抽象类
            if (Prototype.class.isAssignableFrom(clazz) && !clazz.isInterface() && Modifier.isAbstract(clazz.getModifiers())) {
                // 创建实例
                Prototype prototype = (Prototype) clazz.getDeclaredConstructor().newInstance();
                // 以类名作为键存储
                PROTOTYPE_MAP.put(clazz.getSimpleName(), prototype);
                System.out.println("Registered prototype: " + clazz.getSimpleName());
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 NoSuchMethodException | InvocationTargetException e) {
            // 忽略无法实例化的类
            System.err.println("Failed to register prototype: " + className + ", reason: " + e.getMessage());
        }
    }

    // 获取克隆实例
    public static Prototype getClone(String className) {
        Prototype prototype = PROTOTYPE_MAP.get(className);
        if (prototype != null) {
            return prototype.clone();
        }
        return null;
    }

    // 获取所有已注册的原型类名
    public static Set<String> getAllPrototypeNames() {
        return new HashSet<>(PROTOTYPE_MAP.keySet());
    }

    // 添加自定义原型
    public static void addPrototype(String className, Prototype prototype) {
        PROTOTYPE_MAP.put(className, prototype);
    }
}