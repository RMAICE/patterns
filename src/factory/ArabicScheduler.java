package factory;

public class ArabicScheduler extends AbstractScheduler {
    @Override
    protected Calendar createCalendar() {
        return new ArabicCalendar();
    }
}
