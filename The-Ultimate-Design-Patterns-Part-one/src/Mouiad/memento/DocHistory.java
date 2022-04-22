package Mouiad.memento;

import java.util.ArrayList;
import java.util.List;

public class DocHistory {
    private List<DocState> docStates = new ArrayList<>();

    public void push(DocState docstate){
        docStates.add(docstate);
    }
    public DocState pop(){
        int lastIndex = docStates.size()-1;
        DocState lastDocState = docStates.get(lastIndex);
        docStates.remove(lastIndex);
        return lastDocState;
    }
}
