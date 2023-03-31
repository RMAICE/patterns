package factory;

import java.util.Date;

public abstract class AbstractScheduler {
    private Calendar calendar;

    public AbstractScheduler() {
        calendar = createCalendar();
    }

    public void schedule(Event event) {
        var today = new Date();
        calendar.addEvent(event, today);
    }

    protected abstract Calendar createCalendar();
}
