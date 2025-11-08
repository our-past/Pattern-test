package one_test.three_BuilderPattern.model;

import lombok.Data;
import one_test.three_BuilderPattern.model.clothing.Clothing;
import one_test.three_BuilderPattern.model.face.Face;
import one_test.three_BuilderPattern.model.hairstyle.Hairstyle;
import one_test.three_BuilderPattern.model.sex.Sex;

@Data
public class Model {
    private Face face;

    private Clothing clothing;

    private Hairstyle hairstyle;

    private Sex sex;


}
