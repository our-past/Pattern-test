package three.builder;

import three.figure.Figure;
import three.model.Model;

import java.lang.reflect.Method;

public class FigureBuilder {

    private Model model;

    public static FigureBuilder Builder(){
        return new FigureBuilder();
    }

    public FigureBuilder Model(Model model){
        this.model = model;
        return this;
    }

    public FigureBuilder  Model(String ModelName){
        Class<?> clazz = ModelBuilder.class;
        ModelBuilder modelBuilder = new ModelBuilder();
        Method[] methods = clazz.getDeclaredMethods();
        boolean found = false;
        for (Method method : methods) {
            if (method.getName().contains(ModelName+"Model")) {
                try {
                    method.setAccessible(true);
                    method.invoke(modelBuilder);
                    found = true;
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            }
        }
        if (!found) {
            System.out.println("Model "+ModelName+" not found");
        }
        this.model = modelBuilder.Build();
        return this;
    }


    public Figure Build(){
        Figure figure = new Figure();
        figure.setModel(model);
        return figure;
    }
}
