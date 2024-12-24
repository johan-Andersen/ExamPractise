package ChatØvelse4;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Book> arrayList = new ArrayList<>();
        Bibliotek bibliotek = new Bibliotek(arrayList);

        Book book = new Book("GOF", "GGR", 12345);
        Book book2 = new Book("Harry potter", "rowkin", 321);
        Book book3 = new Book("Walking dead", "johan", 666 );

        bibliotek.tilføjBog(book);
        bibliotek.tilføjBog(book2);
        bibliotek.tilføjBog(book3);

        System.out.println(bibliotek.udskriv());

        System.out.println(bibliotek.Søg("GOF"));

        bibliotek.fjernBog(666);

        System.out.println(bibliotek.udskriv());


    }

}
