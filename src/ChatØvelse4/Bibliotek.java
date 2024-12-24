package ChatØvelse4;

import java.util.ArrayList;
import java.util.List;

public class Bibliotek {

    private List<Book> liste;

    public Bibliotek(List<Book> liste) {
        this.liste = liste;
    }

    public void tilføjBog(Book book) {
        liste.add(book);
    }

    public void fjernBog(int ISBN) {

        for(int i = 0; i < liste.size(); i++) {

            if(liste.get(i).getISBN() == ISBN) {
                liste.remove(i);
                i--;
            }
        }
    }

    public List<Book> Søg(String ord) {
        List<Book> resultat = new ArrayList<>();
        for(Book book : liste) {
            if(book.getForfatter().contains(ord) || book.getTitel().contains(ord)) {
                resultat.add(book);
            }
        }
        return resultat;
    }

    public String udskriv() {

        StringBuilder resultat = new StringBuilder();
        for (Book book : liste) {
            resultat.append(book.toString()).append("\n");
        }
        return resultat.toString();
    }




}
