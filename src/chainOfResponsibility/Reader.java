package chainOfResponsibility;

public abstract class Reader {
    protected Reader next;

    protected abstract void exec(String fileName);

    public void read(String fileName) {
        if (fileName.endsWith(getExtension())) {
            exec(fileName);
            return;
        }
        
        if (next == null)
            throw new UnsupportedOperationException("File format not supported.");

        next.read(fileName);
    };

    public void setNext(Reader next) {
        this.next = next;
    }

    protected abstract String getExtension();
}
