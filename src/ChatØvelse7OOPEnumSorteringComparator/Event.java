package ChatØvelse7OOPEnumSorteringComparator;

import javax.swing.text.DateFormatter;
import java.sql.Date;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Event {

    private String title;
    private String date;
    private double duration;
    private PriorityLevel priority;

    public Event(String title, String date, double duration, PriorityLevel priority) {

        this.title = title;

        if(isValidDate(date)) {
            this.date = date;
        }
        else {
            throw new IllegalArgumentException("Date must follow the structure: yyyy-MM-dd");
        }
        this.duration = duration;
        this.priority = priority;

    }

    private boolean isValidDate(String date) {
        try {
            // Create a DateTimeFormatter with the required format
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

            // Try to parse the input string using the formatter
            LocalDate.parse(date, formatter); // if this works the date is valid

            // return true if parsing succeeds
            return true;
        } catch (DateTimeParseException e) {
            //if parsing fails, it throws an exception, and we return false;
            return false;
        }
    }

    public String getDate() {
        return date;
    }

    public PriorityLevel getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Date: " + date + ", Duration: " + duration + ", Priority: " + priority;
    }

}
