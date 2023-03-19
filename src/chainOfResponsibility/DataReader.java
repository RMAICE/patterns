package chainOfResponsibility;

public class DataReader {
    public static Reader getReadersChain() {
        var qbwReader = new QbwReader();
        var numbersReader = new NumbersReader();
        var xlsReader = new XlsReader();

        xlsReader.setNext(numbersReader);
        numbersReader.setNext(qbwReader);

        return xlsReader;
    }
}
