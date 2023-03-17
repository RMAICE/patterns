package command;

public class SetContrastCommand extends AbstractUndoableCommand {
    private float prevContrast;
    private float newContrast;
    
    public SetContrastCommand(VideoEditor videoEditor, History history, float newContrast) {
        super(videoEditor, history);
        this.newContrast = newContrast;
    }

    @Override
    public void undo() {
        videoEditor.setContrast(prevContrast);
    }

    @Override
    protected void doExecute() {
        prevContrast = videoEditor.getContrast();
        videoEditor.setContrast(newContrast);
    }
}
