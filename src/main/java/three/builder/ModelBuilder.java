package three.builder;

import three.model.Model;
import three.model.clothing.Clothing;
import three.model.clothing.impl.AngelClothing;
import three.model.clothing.impl.DevilClothing;
import three.model.clothing.impl.HeroClothing;
import three.model.face.Face;
import three.model.face.impl.AngelFace;
import three.model.face.impl.DevilFace;
import three.model.face.impl.HeroFace;
import three.model.hairstyle.Hairstyle;
import three.model.hairstyle.impl.AngelHairstyle;
import three.model.hairstyle.impl.DevilHairstyle;
import three.model.hairstyle.impl.HeroHairstyle;
import three.model.sex.Sex;
import three.model.sex.impl.AngelSex;
import three.model.sex.impl.DevilSex;
import three.model.sex.impl.HeroSex;

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
