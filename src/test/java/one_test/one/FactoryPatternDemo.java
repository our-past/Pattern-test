package one_test.one;

import one_test.one.factory.LogFactory;
import one_test.one.log.Log;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        Log log = LogFactory.createLog("file");
        if (log != null) {
            log.record();
        }
        log = LogFactory.createLog("database");
        if (log != null) {
            log.record();
        }
    }
}
