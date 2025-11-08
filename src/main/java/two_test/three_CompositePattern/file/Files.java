package two_test.three_CompositePattern.file;

import lombok.Data;
import two_test.three_CompositePattern.contact.FileType;

@Data
public abstract class Files {
    String type;
    String name;
    String path;
    int size;
    String user;
    public Files(String type, String name, String path, int size, String user) {
        this.type = type;
        this.name = name;
        this.path = path;
        this.size = size;
        this.user = user;
    }

    void showInfo(String indent){
        if(!type.equals(FileType.Del.getType())){
            System.out.println(indent+"type: "+ type + " name: " + name+"."+type + " path: " + path + " size: " + size + "MB" + " user: " + user);
        }
    }

}
