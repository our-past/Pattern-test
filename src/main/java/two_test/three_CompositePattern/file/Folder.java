package two_test.three_CompositePattern.file;

import two_test.three_CompositePattern.contact.FileType;

import java.util.Hashtable;

//默认size为0
public class Folder extends Files{
    Hashtable<String,Files> files;

    public Folder(String type, String name, String path,int size,String user) {
        super(type, name, path, size, user);
        files = new Hashtable<>();
    }

     public void addFile(Files file){
        files.put(file.getName()+"."+file.getType(),file);
        size+=file.size;
    }

    public void removeFile(Files file){
        if (!files.containsKey(file.getName()+"."+file.getType())){
            throw new RuntimeException("文件不存在");
        }
        files.remove(file.getName()+"."+file.getType());
        size-=file.size;
    }

    public Hashtable<String,Files> getFiles(){
        return files;
    }

    @Override
    public void showInfo(String indent){
        if(!type.equals(FileType.Del.getType())){
            System.out.println(indent+"type: "+ type + " name: " + name+"."+type + " path: " + path + " size: " + size + "MB" + " user: " + user+" files:");
            for(Files file: files.values()){
                file.showInfo(indent+"    ");
            }
        }
    }
}
