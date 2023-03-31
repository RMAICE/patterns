package singleton;

import java.util.HashMap;
import java.util.Map;

public class Logger {
    private String fileName;
    private static Map<String, Logger> loggers = new HashMap<>();

    private Logger(String fileName) {
        this.fileName = fileName;
    }

    public void write(String message) {
        System.out.println(String.format("Writing a '%s' to the %s.log", message, fileName));
    }

    public static Logger getLogger(String fileName) {
        if (!loggers.containsKey(fileName)) {
            loggers.put(fileName, new Logger(fileName));
        }

        return loggers.get(fileName);
    }
}
