package strategy;

public class JPEGCompressor implements Compressor {

    @Override
    public void compress(String fileName) {
        System.out.println("compressing to jpeg");
    }

}
