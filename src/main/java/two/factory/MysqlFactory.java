package two.factory;

import two.connection.Connection;
import two.connection.impl.MysqlConnection;
import two.statement.Statement;
import two.statement.impl.MysqlStatement;

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
