package Øvelse19Comparator;

import java.time.LocalDate;
import java.util.Comparator;

public class DateComparator implements Comparator<Dream> {


    @Override
    public int compare(Dream o1, Dream o2) {

        LocalDate date1 = LocalDate.parse(o1.getDate());
        LocalDate date2 = LocalDate.parse(o2.getDate());

        return date1.compareTo(date2);
    }
}
