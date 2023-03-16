package template;

public class FullScreenWindow extends Window {
    @Override
    protected void beforeClose() {
        System.out.println("Executing code before closing the window");
    }

    @Override
    protected void afterClose() {
        System.out.println("Executing code after closing the window");
    }
}
