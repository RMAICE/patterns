package strategy;

public class HighContrastFilter implements Filter {

    @Override
    public void filter(String fileName) {
        System.out.println("Applyting high-contrast filter");
    }

}
