package decorator;

public class Artefact implements AbstractArtefact {
    private String name;

    public Artefact(String name) {
        this.name = name;
    }

    public String render() {
        return name + getIcon();
    }

    public String getIcon() {
        return "";
    }
}
