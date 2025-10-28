package one.log.impl;

import one.log.Log;

public class FileLog implements Log {
    @Override
    public void record() {
        System.out.println("FileLog.record");
    }
}
