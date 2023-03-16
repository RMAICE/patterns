package strategy;

public class BWFilter implements Filter {

    @Override
    public void filter(String fileName) {
        System.out.println("Applying B&W filter");
    }

}
