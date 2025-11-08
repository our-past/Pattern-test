package one_test.two_AbstractFactoryPattern.factory;

import one_test.two_AbstractFactoryPattern.connection.Connection;
import one_test.two_AbstractFactoryPattern.connection.impl.MysqlConnection;
import one_test.two_AbstractFactoryPattern.statement.Statement;
import one_test.two_AbstractFactoryPattern.statement.impl.MysqlStatement;

public class MysqlFactory extends AbstractFactory {
    @Override
    public Connection getConnection() {
        return new MysqlConnection();
    }

    @Override
    public Statement createStatement() {
        return new MysqlStatement();
    }
}
