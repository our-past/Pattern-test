package two;

import two.connection.Connection;
import two.factory.AbstractFactory;
import two.factory.produceer.FactoryProducer;
import two.statement.Statement;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        // 创建Mysql工厂
        AbstractFactory mysqlFactory = FactoryProducer.getFactory("Mysql");
        if (mysqlFactory == null){
            System.out.println("Mysql工厂不存在");
            return;
        }
        // 创建Oracle工厂
        AbstractFactory oracleFactory = FactoryProducer.getFactory("Oracle");
        if (oracleFactory == null){
            System.out.println("Oracle工厂不存在");
            return;
        }

        // 使用Mysql工厂创建连接和语句
        Connection mysqlConnection = mysqlFactory.getConnection();
        Statement mysqlStatement = mysqlFactory.createStatement();

        // 使用Oracle工厂创建连接和语句
        Connection oracleConnection = oracleFactory.getConnection();
        Statement oracleStatement = oracleFactory.createStatement();

        // 执行Mysql语句
        mysqlConnection.connect();
        mysqlStatement.execute();
        mysqlStatement.close();
        mysqlConnection.close();

        // 执行Oracle语句
        oracleConnection.connect();
        oracleStatement.execute();
        oracleStatement.close();
        oracleConnection.close();
    }
}
