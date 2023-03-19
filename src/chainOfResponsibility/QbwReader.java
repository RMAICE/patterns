package chainOfResponsibility;

public class QbwReader extends Reader {
    @Override
    protected void exec(String fileName) {
        System.out.println("Reading data from a QuickBooks file.");
    }

    @Override
    protected String getExtension() {
        return ".qbw";
    }
}
