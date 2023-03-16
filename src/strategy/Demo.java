package strategy;

public class Demo {
    public static void main(String[] args) {
        ImageStorage storage = new ImageStorage(new PNGCompressor(), new BWFilter());

        storage.store(null);
    }
}
