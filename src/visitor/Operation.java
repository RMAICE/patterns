package visitor;

public interface Operation {
    void apply(FactSegment segment);
    void apply(FormatSegment segment);
}
