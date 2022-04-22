package Mouiad.memento;

public class DocState {
    private final String content;
    private final String fontName;
    private final int fontSize;

    public DocState(String content, String fontName, int fontSize) {
        this.content = content;
        this.fontName = fontName;
        this.fontSize = fontSize;
    }


    public String getContent() {
        return content;
    }

    public String getFontName() {
        return fontName;
    }

    public int getFontSize() {
        return fontSize;
    }
}
