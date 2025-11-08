package one_test.two_AbstractFactoryPattern.connection.impl;

import one_test.two_AbstractFactoryPattern.connection.Connection;

public class MysqlConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("Mysql连接成功");
    }
    @Override
    public void close() {
        System.out.println("Mysql连接关闭成功");
    }
}
