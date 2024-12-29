package ChatØvelse7OOPEnumSorteringComparator;

import java.util.Comparator;

public class DateComparator implements Comparator<Event> {


    @Override
    public int compare(Event o1, Event o2) {
        return o1.getDate().compareTo(o2.getDate());
    }
}
