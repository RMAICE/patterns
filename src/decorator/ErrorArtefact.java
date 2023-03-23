package decorator;

public class ErrorArtefact implements AbstractArtefact {
    private AbstractArtefact artefact;

    public ErrorArtefact(AbstractArtefact artefact) {
        this.artefact = artefact;
    }

    @Override
    public String render() {
        return artefact.render() + getIcon();
    }
    
    public String getIcon() {
        return " [Error]";
    }
}
