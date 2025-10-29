package one_test.two.factory;

import one_test.two.connection.Connection;
import one_test.two.statement.Statement;

public abstract class AbstractFactory {
    public abstract Connection getConnection();
    public abstract Statement createStatement();
}
