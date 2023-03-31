package singleton;

public class Demo {
    public static void main(String[] args) {
        Logger accessLogger = Logger.getLogger("access");
        Logger errorLogger = Logger.getLogger("error");

        accessLogger.write("success 1");
        accessLogger.write("success 2");
        errorLogger.write("error 3");
        errorLogger.write("error 4");
    }
}
