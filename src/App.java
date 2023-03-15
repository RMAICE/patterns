public class App {
    public static void main(String[] args) {
        drawUI(new TextBox());
    }

    public static void drawUI(UIControl control) {
        control.draw();
    }
}
