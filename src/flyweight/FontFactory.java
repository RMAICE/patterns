package flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class FontFactory {
    private Map<Integer, CellFontData> fonts = new HashMap<>();

    public CellFontData getFont(int size, boolean isBold, String fontFamily) {
        var hash = Objects.hash(size, isBold, fontFamily);

        if (!fonts.containsKey(hash))
            fonts.put(hash, new CellFontData(size, isBold, fontFamily));

        return fonts.get(hash);
    }
}
