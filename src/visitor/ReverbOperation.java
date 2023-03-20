package visitor;

public class ReverbOperation implements Operation {
    @Override
    public void apply(FactSegment segment) {
        System.out.println("Add Reverb fact segment");
    }

    @Override
    public void apply(FormatSegment segment) {
        System.out.println("Add Reverb format segment");
    }
}
