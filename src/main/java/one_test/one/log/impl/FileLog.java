package one_test.one.log.impl;

import one_test.one.log.Log;

public class FileLog implements Log {
    @Override
    public void record() {
        System.out.println("FileLog.record");
    }
}
