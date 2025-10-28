package two.statement.impl;

import two.statement.Statement;

public class MysqlStatement implements Statement {
    @Override
    public void execute() {
        System.out.println("Mysql语句执行成功");
    }
    @Override
    public void close() {
        System.out.println("Mysql语句关闭成功");
    }
}
