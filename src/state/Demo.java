package state;

public class Demo {
    public static void main(String[] args) {
        var DirectionService = new DirectionService();

        DirectionService.setTravelMode(new WalkingTravel());

        System.out.println(DirectionService.getEta());
        System.out.println(DirectionService.getDirection());
    }
}
