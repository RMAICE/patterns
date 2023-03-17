package command;

public abstract class AbstractUndoableCommand implements UndoableCommand {
    protected VideoEditor videoEditor;
    protected History history;
    
    public AbstractUndoableCommand(VideoEditor videoEditor, History history) {
        this.videoEditor = videoEditor;
        this.history = history;
    }

    public void execute() {
        doExecute();

        history.push(this);
    };

    protected abstract void doExecute();
}
