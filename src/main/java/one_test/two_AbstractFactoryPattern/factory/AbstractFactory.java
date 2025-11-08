package one_test.two_AbstractFactoryPattern.factory;

import one_test.two_AbstractFactoryPattern.connection.Connection;
import one_test.two_AbstractFactoryPattern.statement.Statement;

public abstract class AbstractFactory {
    public abstract Connection getConnection();
    public abstract Statement createStatement();
}
