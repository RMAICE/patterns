package builder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Document {
    private List<Element> elements = new ArrayList<>();

    public void add(Element element) {
        elements.add(element);
    }

    public void export(DocumentBuilder documentBuilder, String fileName) throws IOException {
        for (Element element : elements) {
            if (element instanceof Text)
                documentBuilder.addText((Text)element);
            else if (element instanceof Image)
                documentBuilder.addImage((Image)element);
        }

        var writer = new FileWriter(fileName);
        writer.write(documentBuilder.getContent());
        writer.close();
    }
}
