package two_test.three_CompositePattern.factory;

import two_test.three_CompositePattern.file.*;

public class FilesFactory {

        public static Files createFile(String type, String name, String path, int size, String user){
            return switch (type) {
                case "file" -> new File(type, name, path, size, user);
                case "video" -> new VideoFile(type, name, path, size, user);
                case "image" -> new ImageFile(type, name, path, size, user);
                case "folder" -> new Folder(type, name, path, size, user);
                case "text" -> new TextFile(type, name, path, size, user);
                default -> throw new RuntimeException("文件类型错误");
            };
        }
}
