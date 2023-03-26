package flyweight;

public class CellFontData {
    private int size;
    private boolean isBold;
    private String fontFamily;

    public CellFontData(int size, boolean isBold, String fontFamily) {
        this.size = size;
        this.isBold = isBold;
        this.fontFamily = fontFamily;
    }

    public int getSize() {
        return size;
    }

    public boolean getIsBold() {
        return isBold;
    }

    public String getFontFamily() {
        return fontFamily;
    }
}
