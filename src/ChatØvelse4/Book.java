package ChatØvelse4;

public class Book {

    private String titel;
    private String forfatter;
    private int ISBN;

    public Book (String titel, String forfatter, int ISBN) {

        this.titel = titel;
        this.forfatter = forfatter;
        this.ISBN = ISBN;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getForfatter() {
        return forfatter;
    }

    public String getTitel() {
        return titel;
    }

    @Override
    public String toString() {

        return "titel: " + titel + ", Forfatter: " + forfatter + ", ISBN: " + ISBN;

    }
}
