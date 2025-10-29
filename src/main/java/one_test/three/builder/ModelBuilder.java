package one_test.three.builder;

import one_test.three.model.Model;
import one_test.three.model.clothing.Clothing;
import one_test.three.model.clothing.impl.AngelClothing;
import one_test.three.model.clothing.impl.DevilClothing;
import one_test.three.model.clothing.impl.HeroClothing;
import one_test.three.model.face.Face;
import one_test.three.model.face.impl.AngelFace;
import one_test.three.model.face.impl.DevilFace;
import one_test.three.model.face.impl.HeroFace;
import one_test.three.model.hairstyle.Hairstyle;
import one_test.three.model.hairstyle.impl.AngelHairstyle;
import one_test.three.model.hairstyle.impl.DevilHairstyle;
import one_test.three.model.hairstyle.impl.HeroHairstyle;
import one_test.three.model.sex.Sex;
import one_test.three.model.sex.impl.AngelSex;
import one_test.three.model.sex.impl.DevilSex;
import one_test.three.model.sex.impl.HeroSex;

public class ModelBuilder {

    private Face face;

    private Clothing clothing;

    private Hairstyle hairstyle;

    private Sex sex;

    public static ModelBuilder Builder(){
        return new ModelBuilder();
    }

    public ModelBuilder Face(Face face){
        this.face = face;
        return this;
    }

    public ModelBuilder Clothing(Clothing clothing){
        this.clothing = clothing;
        return this;
    }

    public ModelBuilder Hairstyle(Hairstyle hairstyle){
        this.hairstyle = hairstyle;
        return this;
    }

    public ModelBuilder Sex(Sex sex){
        this.sex = sex;
        return this;
    }

    public ModelBuilder AngelModel(){
        face=new AngelFace();
        clothing=new AngelClothing();
        hairstyle=new AngelHairstyle();
        sex=new AngelSex();
        return this;
    }
    public ModelBuilder HeroModel(){
        face=new HeroFace();
        clothing=new HeroClothing();
        hairstyle=new HeroHairstyle();
        sex=new HeroSex();
        return this;
    }
    public ModelBuilder DevilModel(){
        face=new DevilFace();
        clothing=new DevilClothing();
        hairstyle=new DevilHairstyle();
        sex=new DevilSex();
        return this;
    }

    public Model Build(){
        Model model = new Model();
        model.setFace(face);
        model.setClothing(clothing);
        model.setHairstyle(hairstyle);
        model.setSex(sex);
        return model;
    }
}
