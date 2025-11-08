package two_test.three_CompositePattern;

import two_test.three_CompositePattern.factory.FilesFactory;
import two_test.three_CompositePattern.product.AntiVirus;
import two_test.three_CompositePattern.product.FilesManagement;

public class CompositePatternDemo {
    public static void main(String[] args) {
        AntiVirus antiVirus = new AntiVirus(new FilesManagement());
        antiVirus.getFilesManagement().addFile(FilesFactory.createFile("file", "test1", "C:\\test", 100, "user1"));
        antiVirus.getFilesManagement().addFile(FilesFactory.createFile("file", "test2", "C:\\test", 100, "user2"));
        antiVirus.getFilesManagement().addFile(FilesFactory.createFile("file", "test3", "C:\\test\\ss\\", 100, "user3"));
        antiVirus.getFilesManagement().addFile(FilesFactory.createFile("video", "test4", "C:\\test\\ss\\", 100, "user3"));
        antiVirus.getFilesManagement().scan();
        antiVirus.killVirus("C:\\test\\ss\\");
        antiVirus.getFilesManagement().scan();
    }
}
