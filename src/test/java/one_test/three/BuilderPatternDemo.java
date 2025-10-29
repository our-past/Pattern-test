package one_test.three;

import one_test.three.builder.FigureBuilder;
import one_test.three.builder.ModelBuilder;
import one_test.three.figure.Figure;
import one_test.three.model.Model;
import one_test.three.model.clothing.impl.HeroClothing;
import one_test.three.model.face.impl.AngelFace;
import one_test.three.model.hairstyle.impl.DevilHairstyle;
import one_test.three.model.sex.impl.DevilSex;

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
