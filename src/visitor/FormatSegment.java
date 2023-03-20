package visitor;

public class FormatSegment implements Segment {
    @Override
    public void exec(Operation operation) {
        operation.apply(this);
    }
}
