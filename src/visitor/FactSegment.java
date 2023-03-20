package visitor;

public class FactSegment implements Segment {
    @Override
    public void exec(Operation operation) {
        operation.apply(this);
    }
}
