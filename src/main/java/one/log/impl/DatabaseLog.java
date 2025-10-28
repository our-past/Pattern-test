package one.log.impl;

import one.log.Log;

public class DatabaseLog implements Log {
    @Override
    public void record() {
        System.out.println("DatabaseLog.record");
    }
}
