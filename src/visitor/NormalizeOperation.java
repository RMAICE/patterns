package visitor;

public class NormalizeOperation implements Operation {

    @Override
    public void apply(FactSegment segment) {
        System.out.println("Normalize fact segment");
    }

    @Override
    public void apply(FormatSegment segment) {
        System.out.println("Normalize format segment");
    }
    
}
