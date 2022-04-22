package Mouiad.memento;

public class Document {
    private String content;
    private String fontName;
    private int fontSize;



    public DocState createState(){
        return new DocState(content, fontName, fontSize);
    }
    public void reset(DocState docstate){
        this.content = docstate.getContent();
        this.fontName = docstate.getFontName();
        this.fontSize = docstate.getFontSize();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }
}
