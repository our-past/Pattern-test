package two.factory;

import two.connection.Connection;
import two.connection.impl.OracleConnection;
import two.statement.Statement;
import two.statement.impl.OracleStatement;

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
