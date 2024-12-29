package Øvelse19Comparator;

import java.util.Comparator;
import java.util.List;

public class Dream {

    private String date;
    private int duration;
    private String type;

    public Dream(int duration, String type, String date) {

//        this.date = LocalDate.now().toString();
        this.date = date;
        this.duration = duration;
        if(!type.equalsIgnoreCase("problemløsende") && !type.equalsIgnoreCase("neutral") && !type.equalsIgnoreCase("mareridt")) {

            throw new IllegalArgumentException("invalid input: Type must either be 'problemløsende', 'neutral' or 'mareridt'");
        }
        else {
            this.type = type;
        }
    }

    public String getDate() {
     return date;
    }

    public String isPleasant() {

        if(type.equalsIgnoreCase("mareridt")) {

            return "Unpleasant";

        }
        else if(type.equalsIgnoreCase("problemløsende")) {
            if(duration < 10) {
                return "Pleasant";
            }
            else {
                return "Unpleasant";
            }
        }
        else {
            if(duration > 10) {
                return "Pleasant";
            }
            else {
                return "Unpleasant";
            }
        }
    }

    public StringBuilder sort(List<Dream> dreams) {

        Comparator compare = new DateComparator();

        dreams.sort(compare);

        StringBuilder build = new StringBuilder();

        for(Dream d : dreams) {

            build.append(d).append("\n");

        }

        return build;
    }


    @Override
    public String toString() {
        return "Date: " + date + ", Duration: " + duration + ", Type: " + type;
    }


}
