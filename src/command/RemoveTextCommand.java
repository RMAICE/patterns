package command;

public class RemoveTextCommand extends AbstractUndoableCommand {
    private String prevText;

    public RemoveTextCommand(VideoEditor videoEditor, History history) {
        super(videoEditor, history);
    }

    @Override
    public void undo() {
        videoEditor.setText(prevText);
    }

    @Override
    public void doExecute() {
        prevText = videoEditor.getText();
        videoEditor.removeText();
    }
}
