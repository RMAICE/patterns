package chainOfResponsibility;

public class NumbersReader extends Reader {
    @Override
    protected void exec(String fileName) {
        System.out.println("Reading data from a Numbers spreadsheet.");
    }

    @Override
    protected String getExtension() {
        return ".numbers";
    }
}
