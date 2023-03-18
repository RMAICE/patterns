package mediator;

import java.util.ArrayList;
import java.util.List;

public abstract class UIControl {
    private List<EventHandler> eventHandlers = new ArrayList<>();

    void addEventHandler(EventHandler eventHandler) {
        eventHandlers.add(eventHandler);
    }

    void notifyEventHandlers() {
        for (var eventHandler : eventHandlers)
            eventHandler.handle();
    }
}
