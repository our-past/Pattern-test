package one_test.three_BuilderPattern;

import one_test.three_BuilderPattern.builder.FigureBuilder;
import one_test.three_BuilderPattern.builder.ModelBuilder;
import one_test.three_BuilderPattern.figure.Figure;
import one_test.three_BuilderPattern.model.Model;
import one_test.three_BuilderPattern.model.clothing.impl.HeroClothing;
import one_test.three_BuilderPattern.model.face.impl.AngelFace;
import one_test.three_BuilderPattern.model.hairstyle.impl.DevilHairstyle;
import one_test.three_BuilderPattern.model.sex.impl.DevilSex;

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
