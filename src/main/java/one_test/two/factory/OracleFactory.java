package one_test.two.factory;

import one_test.two.connection.Connection;
import one_test.two.connection.impl.OracleConnection;
import one_test.two.statement.Statement;
import one_test.two.statement.impl.OracleStatement;

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
