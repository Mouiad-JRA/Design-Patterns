package Mouiad.state;

public class Canves {
    private Tool currentTool;
    public void mouseDown(){
        currentTool.mouseDown();
    }
    public void mouseUp(){
        currentTool.mouseUP();
    }

    public Tool getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(Tool currentTool) {
        this.currentTool = currentTool;
    }
}
