package two_test.four_DecoratorPattern.decorator;

import two_test.four_DecoratorPattern.component.Component;

public class VisualDecorator extends AbstractDecorator{

    public VisualDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("添加VisualComponent可视化组件的装饰");
    }

}
