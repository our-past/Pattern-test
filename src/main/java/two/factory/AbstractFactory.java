package two.factory;

import two.connection.Connection;
import two.statement.Statement;

public abstract class AbstractFactory {
    public abstract Connection getConnection();
    public abstract Statement createStatement();
}
