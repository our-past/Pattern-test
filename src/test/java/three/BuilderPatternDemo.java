package three;

import three.builder.FigureBuilder;
import three.builder.ModelBuilder;
import three.figure.Figure;
import three.model.Model;
import three.model.clothing.impl.HeroClothing;
import three.model.face.impl.AngelFace;
import three.model.hairstyle.impl.DevilHairstyle;
import three.model.sex.impl.DevilSex;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        Figure figure = FigureBuilder.Builder().Model("Devil").Build();
        System.out.println(figure);

        figure = FigureBuilder.Builder().Model("Hero").Build();
        System.out.println(figure);

        figure = FigureBuilder.Builder().Model("Angel").Build();
        System.out.println(figure);

        Model model = ModelBuilder.Builder()
                .Sex(new DevilSex())
                .Face(new AngelFace())
                .Clothing(new HeroClothing())
                .Hairstyle(new DevilHairstyle())
                .Build();
        figure = FigureBuilder.Builder().Model(model).Build();
        System.out.println(figure);
    }
}
