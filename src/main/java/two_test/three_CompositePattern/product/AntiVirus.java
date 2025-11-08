package two_test.three_CompositePattern.product;

import lombok.Data;
import two_test.three_CompositePattern.contact.FileType;
import two_test.three_CompositePattern.file.Files;

import java.util.List;
import java.util.Random;

@Data
public class AntiVirus {

     FilesManagement filesManagement;

    public AntiVirus(FilesManagement filesManagement){
        this.filesManagement = filesManagement;
    }

    public void killVirus(String path){
        System.out.println("查杀"+path+"中的病毒");
        List<Files> filesList = filesManagement.findFileByPath(path);
        for (Files file : filesList) {
            System.out.println("查杀"+file.getName()+"中的病毒");
            if(new Random().nextInt(100) > 50){
                file.setSize(0);
                file.setType(FileType.Del.getType());
                System.out.println("查杀"+file.getName()+"中的病毒成功");
            }else{
                System.out.println("查杀"+file.getName()+"中的病毒失败");
            }
        }
    }
}
