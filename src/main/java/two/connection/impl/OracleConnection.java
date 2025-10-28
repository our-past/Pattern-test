package two.connection.impl;

import two.connection.Connection;

public class OracleConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("Oracle连接成功");
    }
    @Override
    public void close() {
        System.out.println("Oracle连接关闭成功");
    }
}
