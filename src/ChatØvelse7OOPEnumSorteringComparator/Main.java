package ChatØvelse7OOPEnumSorteringComparator;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        ArrayList<Event> eventList = new ArrayList<>();
        eventList.add(new Event("johan", "2024-11-11", 20, PriorityLevel.FIRST_PRIORITY));
        eventList.add(new Event("Clara", "2023-11-20", 21, PriorityLevel.SECOND_PRIORITY));
        eventList.add(new Event("Far", "2024-12-02", 10, PriorityLevel.LATE_PRIORITY));
        eventList.add(new Event("Mor", "2022-02-01", 23, PriorityLevel.THIRD_PRIORITY));
        eventList.add(new Event("Emil", "1929-02-02", 200, PriorityLevel.LATE_PRIORITY));


        Calendar calendar = new Calendar(eventList);

        System.out.println(calendar.sortByDate());

        System.out.println(calendar.filterByPriority(PriorityLevel.LATE_PRIORITY));

        calendar.saveToFile();

    }


}
