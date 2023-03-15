package state;

public class DirectionService {
    private Travel travel;

    public Object getEta() {
        return travel.getEta();
    }

    public Object getDirection() {
        return travel.getDirection();
    }

    public Travel getTravelMode() {
        return travel;
    }

    public void setTravelMode(Travel travel) {
        this.travel = travel;
    }
}
