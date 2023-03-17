package command;

public class Demo {
    public static void main(String[] args) {
        var videoEditor = new VideoEditor();
        var history = new CommandHistory();
        var setText = new SetTextCommand(videoEditor, history, "hello world!");
        var setContrast = new SetContrastCommand(videoEditor, history, 0.4f);
        var removeText = new RemoveTextCommand(videoEditor, history);
        var undo = new UndoCommand(history);

        setText.execute();
        setContrast.execute();
        removeText.execute();

        System.out.println(videoEditor);
        undo.execute();

        System.out.println(videoEditor);
        undo.execute();

        System.out.println(videoEditor);
        undo.execute();

        System.out.println(videoEditor);
    }
}
