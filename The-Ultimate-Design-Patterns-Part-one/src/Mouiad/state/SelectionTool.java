package Mouiad.state;

public class SelectionTool implements Tool {
    public void mouseDown(){
        System.out.println("Selection Icon");
    }
    public void mouseUP(){
        System.out.println("Draw a dashed rectangle");
    }
}
