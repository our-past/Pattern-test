package two_test.four_DecoratorPattern;

import two_test.four_DecoratorPattern.component.Component;
import two_test.four_DecoratorPattern.component.VisualComponent;
import two_test.four_DecoratorPattern.decorator.AbstractDecorator;
import two_test.four_DecoratorPattern.decorator.VisualDecorator;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Component component = new VisualComponent();
        component.display();
        AbstractDecorator decorator = new VisualDecorator(component);
        decorator.display();
    }
}
