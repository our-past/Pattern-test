package one_test.one_FactoryPattern;

import one_test.one_FactoryPattern.factory.LogFactory;
import one_test.one_FactoryPattern.log.Log;

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
