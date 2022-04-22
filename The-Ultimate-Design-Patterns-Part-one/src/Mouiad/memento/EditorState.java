package Mouiad.memento;
//the orginter
public class EditorState {
    private final String content; // we must not change this

    public EditorState(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
