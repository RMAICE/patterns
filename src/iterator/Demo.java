package iterator;

public class Demo {
    public static void main(String[] args) {
        ProductCollection collection = new ProductCollection();

        collection.add(new Product(1, "milk"));
        collection.add(new Product(2, "eggs"));
        collection.add(new Product(3, "salt"));

        Iterator<Product> iterator = collection.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}
