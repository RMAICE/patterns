package decorator;

public class MainArtefact implements AbstractArtefact {
    private AbstractArtefact artefact;

    public MainArtefact(AbstractArtefact artefact) {
        this.artefact = artefact;
    }

    @Override
    public String render() {
        // TODO Auto-generated method stub
        return artefact.render() + getIcon();
    }

    public String getIcon() {
        return " [Main]";
    }
}
