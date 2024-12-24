package Øvelse8;

public class DateAgeCalculator {

    private int yourAge;
    private int dateAge;

    public DateAgeCalculator(int yourAge, int dateAge) {
        this.yourAge = yourAge;
        this.dateAge = dateAge;
    }

    public int acceptableAge() {
        int lowest = yourAge / 2 + 7;
        return lowest;
    }

    public String tooYoungOrNot() {

        int lowest = yourAge / 2 + 7;

        if(dateAge > lowest) {
            return "Old enough";
        }
        else {
            return "Too young";
        }
    }


}
