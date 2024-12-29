package ChatØvelse6OOPArraysFilerExceptions;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        Product product = new Product("345 relief creame", 188, "Skincare");
        Product product2 = new Product("SKIN 1004 brightening serum", 138, "Skincare");
        Product product3 = new Product("Anua leaf toner", 138, "Skincare");

        ArrayList<OrderLine> list = new ArrayList<>();

        list.add(new OrderLine(product, 2));
        list.add(new OrderLine(product2, 1));
        list.add(new OrderLine(product3, 1));

        Invoice invoice = new Invoice(list);

        System.out.println(invoice.calculateTotal());
        invoice.saveToFile("product.txt");

    }
}
