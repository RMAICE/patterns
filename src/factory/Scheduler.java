package factory;

public class Scheduler extends AbstractScheduler {
    @Override
    protected Calendar createCalendar() {
        return new GregorianCalendar();
    }
}
