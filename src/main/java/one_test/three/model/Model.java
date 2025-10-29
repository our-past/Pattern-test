package one_test.three.model;

import lombok.Data;
import one_test.three.model.clothing.Clothing;
import one_test.three.model.face.Face;
import one_test.three.model.hairstyle.Hairstyle;
import one_test.three.model.sex.Sex;

@Data
public class Model {
    private Face face;

    private Clothing clothing;

    private Hairstyle hairstyle;

    private Sex sex;


}
