package visitor;

public class ReduceNoiseOperation implements Operation {
    @Override
    public void apply(FactSegment segment) {
        System.out.println("Reduce noise fact segment");
    }

    @Override
    public void apply(FormatSegment segment) {
        System.out.println("Reduce noise format segment");
    }
}
