package one_test.two_AbstractFactoryPattern.factory;

import one_test.two_AbstractFactoryPattern.connection.Connection;
import one_test.two_AbstractFactoryPattern.connection.impl.OracleConnection;
import one_test.two_AbstractFactoryPattern.statement.Statement;
import one_test.two_AbstractFactoryPattern.statement.impl.OracleStatement;

public class OracleFactory extends AbstractFactory {
    @Override
    public Connection getConnection() {
        return new OracleConnection();
    }

    @Override
    public Statement createStatement(){
        return new OracleStatement();
    }
}
