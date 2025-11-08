package one_test.two_AbstractFactoryPattern.statement.impl;

import one_test.two_AbstractFactoryPattern.statement.Statement;

public class OracleStatement implements Statement {
    @Override
    public void execute() {
        System.out.println("Oracle语句执行成功");
    }
    @Override
    public void close() {
        System.out.println("Oracle语句关闭成功");
    }
}
