package factory;

public class Demo {
    public static void show() {
        var scheduler = new ArabicScheduler();
        scheduler.schedule(new Event());
    }
}
