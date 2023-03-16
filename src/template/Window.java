package template;

public class Window {
    public void close() {
        beforeClose();

        System.out.println("Removing the window from the screen");

        afterClose();
    }

    protected void beforeClose() {};
    protected void afterClose() {};
}
