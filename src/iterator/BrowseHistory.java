package iterator;

public class BrowseHistory {
    private String[] urls = new String[10];
    private int count = 0;

    public void push(String url) {
        urls[count++] = url;
    }

    public String pop() {
        return urls[--count];
    }

    public Iterator<String> createIterator() {
        return new ArrayIterator(this);
    }

    public class ArrayIterator implements Iterator<String> {
        private BrowseHistory history;
        private int index;

        public ArrayIterator(BrowseHistory history) {
            this.history = history;
        }

        public boolean hasNext() {
            return index < history.count;
        }

        public String current() {
            return history.urls[index];
        }

        public void next() {
            index++;
        }
    }
}
