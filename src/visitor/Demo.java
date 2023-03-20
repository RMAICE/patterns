package visitor;

public class Demo {
    public static void main(String[] args) {
        var wavFile = WavFile.read("test");

        wavFile.exec(new ReduceNoiseOperation());
        wavFile.exec(new NormalizeOperation());
    }
}
