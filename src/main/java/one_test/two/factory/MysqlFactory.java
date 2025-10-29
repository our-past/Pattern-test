package one_test.two.factory;

import one_test.two.connection.Connection;
import one_test.two.connection.impl.MysqlConnection;
import one_test.two.statement.Statement;
import one_test.two.statement.impl.MysqlStatement;

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
