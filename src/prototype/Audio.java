package prototype;

public class Audio implements Component {

    @Override
    public Component clone() {
        return new Audio();
    }
}
