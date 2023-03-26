package flyweight;

public class Cell {
  private final int row;
  private final int column;
  private String content;
  private CellFontData fontData;

  public Cell(int row, int column, CellFontData fontData) {
    this.row = row;
    this.column = column;
    this.fontData = fontData;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public void setFontData(CellFontData fontData) {
    this.fontData = fontData;
  }

  public CellFontData getFontData() {
    return fontData;
  }

  public void render() {
    System.out.printf("(%d, %d): %s [%s]\n", row, column, content, fontData.getFontFamily());
  }
}
