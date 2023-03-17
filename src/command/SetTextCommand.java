package command;

public class SetTextCommand extends AbstractUndoableCommand {
    private String prevText;
    private String newText;

    public SetTextCommand(VideoEditor videoEditor, History history, String newText) {
        super(videoEditor, history);
        this.newText = newText;
    }

    @Override
    public void undo() {
        videoEditor.setText(prevText);
    }

    @Override
    public void doExecute() {
        prevText = videoEditor.getText();
        videoEditor.setText(newText);
    }
}
