package two_test.three_CompositePattern.contact;

import lombok.Getter;

import java.util.List;

@Getter
public enum FileType {
    file("file"),
    video("video"),
    image("image"),
    folder("folder"),
    Del("Del");

    private final String type;
    public static final List<String> fileTypes = List.of("file", "video", "image", "folder");

    FileType(String type) {
        this.type = type;
    }

}
