package command;

import java.util.ArrayList;
import java.util.List;

public class CommandHistory implements History {
    private List<UndoableCommand> commands = new ArrayList<>();

    @Override
    public void push(UndoableCommand command) {
        commands.add(command);
    }

    @Override
    public UndoableCommand pop() {
        var last = commands.get(commands.size() - 1);
        commands.remove(last);

        return last;
    }

    @Override
    public int size() {
        return commands.size();
    }
    
}
