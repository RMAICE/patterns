package memento;

import java.util.ArrayDeque;
import java.util.Deque;

public class History {
    Deque<DocumentMemento> mementos = new ArrayDeque<>();

    public void push(DocumentMemento state) {
        mementos.push(state);
    }

    public DocumentMemento pop() {
        return mementos.pop();
    }
}
