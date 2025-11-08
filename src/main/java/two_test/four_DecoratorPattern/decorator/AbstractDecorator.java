package two_test.four_DecoratorPattern.decorator;

import two_test.four_DecoratorPattern.component.Component;

public abstract class AbstractDecorator implements Component {
    Component component;

    public AbstractDecorator(Component component) {
        this.component = component;
    }

    @Override
    public void display() {
        component.display();
    }
}
