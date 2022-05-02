package Mouiad.template.homework;

import Mouiad.template.AuditTrail;

public abstract class Window {
    private Behaviour behaviour;
    public Window() {
        behaviour = new Behaviour();
    }
    public Window(Behaviour behaviour) {
        this.behaviour = behaviour;
    }
    public void close(){
        behaviour.execute();
        doClose();
    }
    protected abstract void doClose();
}
