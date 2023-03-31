package builder;

public class TextDocumentBuilder implements DocumentBuilder {
    StringBuilder builder = new StringBuilder();

    @Override
    public void addText(Text text) {
        builder.append(text.getContent());
    }

    @Override
    public void addImage(Image image) {

    }

    @Override
    public String getContent() {
        return builder.toString();
    }
}
