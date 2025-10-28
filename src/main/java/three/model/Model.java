package three.model;

import lombok.Data;
import three.model.clothing.Clothing;
import three.model.face.Face;
import three.model.hairstyle.Hairstyle;
import three.model.sex.Sex;

@Data
public class Model {
    private Face face;

    private Clothing clothing;

    private Hairstyle hairstyle;

    private Sex sex;


}
