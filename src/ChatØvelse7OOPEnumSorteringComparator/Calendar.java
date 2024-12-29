package ChatØvelse7OOPEnumSorteringComparator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Comparator;
import java.util.List;

public class Calendar {

    private List<Event> eventList;

    public Calendar(List<Event> eventList) {
        this.eventList = eventList;
    }

    public StringBuilder sortByDate() {

        StringBuilder stringBuilder = new StringBuilder();

        Comparator<Event> comparator = new DateComparator();
        eventList.sort(comparator);

        for(Event e : eventList) {
            stringBuilder.append(e).append("\n");
        }

        return stringBuilder;

    }

    public StringBuilder filterByPriority(PriorityLevel level) {

        StringBuilder stringBuilder = new StringBuilder();

        for(Event e : eventList) {

            if(e.getPriority().equals(level)) {
                stringBuilder.append(e).append("\n");
            }
        }
        return stringBuilder;
    }

    public void saveToFile() {

        try {
            PrintStream printStream = new PrintStream(new FileOutputStream("calendar.txt", true));

            for(Event e : eventList) {
                printStream.println(e);
            }
            printStream.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
