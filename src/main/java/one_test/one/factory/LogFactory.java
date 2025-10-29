package one_test.one.factory;

import one_test.one.log.Log;
import one_test.one.log.impl.DatabaseLog;
import one_test.one.log.impl.FileLog;

public class LogFactory {
    public static Log createLog(String type) {
        if (type == null) {
            return null;
        }
        return switch (type) {
            case "file" -> new FileLog();
            case "database" -> new DatabaseLog();
            default -> null;
        };
    }
}
