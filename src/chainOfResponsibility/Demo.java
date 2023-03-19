package chainOfResponsibility;

public class Demo {
    public static void main(String[] args) {
        var dataReader = DataReader.getReadersChain();

        dataReader.read("table.numbers");
    }
}
