package one.factory;

import one.log.Log;
import one.log.impl.DatabaseLog;
import one.log.impl.FileLog;

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
