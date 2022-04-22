package Mouiad.state.homework;

public class DirectionService {

    private Services service;
    public void calculatingTime(){
        service.calculatingTime();

    }
    public void getDirection() {
        service.getDirection();
    }
    public Services getCurrentService(){
        return service;
    }
    public void setService(Services service){
        this.service = service;
    }

}
