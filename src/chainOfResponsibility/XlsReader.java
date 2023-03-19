package chainOfResponsibility;

public class XlsReader extends Reader {
    @Override
    protected void exec(String fileName) {
        System.out.println("Reading data from an Excel spreadsheet.");
    }

    @Override
    protected String getExtension() {
        return ".xls";
    }
}
