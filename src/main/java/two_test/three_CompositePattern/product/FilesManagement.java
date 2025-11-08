package two_test.three_CompositePattern.product;

import two_test.three_CompositePattern.contact.FileType;
import two_test.three_CompositePattern.factory.FilesFactory;
import two_test.three_CompositePattern.file.Files;
import two_test.three_CompositePattern.file.Folder;

import java.util.ArrayList;
import java.util.List;

public class FilesManagement {

    Folder folder;

    public FilesManagement(){
        this.folder = (Folder) FilesFactory.createFile("folder", "C:", "",  0,"admin");
    }

    public void addFile(Files file){
        Folder pathFolder=folder;
        List<String> pathList = List.of(file.getPath().split("\\\\"));
        if(!pathList.get(0).equals("C:")){
            throw  new RuntimeException("系统只有C盘");
        }
        for(int i=0;i<pathList.size();i++){
            if(i==pathList.size()-1){
                pathFolder.addFile(file);
                return;
            }
            if(pathFolder.getFiles().containsKey(pathList.get(i+1)+"."+"folder")){
                pathFolder.setSize(pathFolder.getSize()+file.getSize());
                pathFolder = (Folder) pathFolder.getFiles().get(pathList.get(i+1)+"."+"folder");
            }else {
                Folder newFolder = (Folder) FilesFactory.createFile("folder",pathList.get(i+1),pathFolder.getPath()+pathFolder.getName()+"\\",0,pathFolder.getUser());
                pathFolder.setSize(pathFolder.getSize()+file.getSize());
                pathFolder.addFile(newFolder);
                pathFolder = newFolder;
            }
        }
    }

    public void removeFile(Files file){
        Folder pathFolder=folder;
        List<String> pathList = List.of(file.getPath().split("\\\\"));
        if(!pathList.get(0).equals("C:")){
            throw  new RuntimeException("系统只有C盘");
        }
        for(int i=0;i<pathList.size();i++){
            if(i==pathList.size()-1){
                pathFolder.removeFile(file);
                return;
            }
            if(pathFolder.getFiles().containsKey(pathList.get(i+1)+"."+"folder")){
                pathFolder.setSize(pathFolder.getSize()-file.getSize());
                pathFolder = (Folder) pathFolder.getFiles().get(pathList.get(i+1)+"."+"folder");
            }else {
                throw new RuntimeException("文件不存在");
            }
        }
    }

    public List<Files> findFileByPath(String path){
        List<Files> filesList = new ArrayList<>();
        Folder pathFolder=folder;
        List<String> pathList = List.of(path.split("\\\\"));
        if(!pathList.get(0).equals("C:")){
            throw  new RuntimeException("系统只有C盘");
        }
        for(int i=0;i<pathList.size();i++){
            if(i==pathList.size()-1){
                filesList.addAll(pathFolder.getFiles().values());
                return filesList;
            }
            if(pathFolder.getFiles().containsKey(pathList.get(i+1)+"."+"folder")){
                pathFolder = (Folder) pathFolder.getFiles().get(pathList.get(i+1)+"."+"folder");
            }else {
                for(String str:FileType.fileTypes){
                    if(pathFolder.getFiles().containsKey(pathList.get(i+1)+"."+str)){
                        filesList.add(pathFolder.getFiles().get(pathList.get(i+1)+"."+str));
                    }
                }
                if(filesList.isEmpty()){
                    throw new RuntimeException("文件不存在");
                }
                return filesList;
            }
        }
        return filesList;
    }

    public void scan(){
        folder.showInfo(" ");
    }
}
