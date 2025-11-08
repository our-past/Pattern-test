package one_test.one_FactoryPattern.log.impl;

import one_test.one_FactoryPattern.log.Log;

public class DatabaseLog implements Log {
    @Override
    public void record() {
        System.out.println("DatabaseLog.record");
    }
}
