package ChatØvelse6OOPArraysFilerExceptions;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Invoice {

    private List<OrderLine> orderLineList;

    public Invoice(List<OrderLine> orderLineList) {
        this.orderLineList = orderLineList;
    }

    public double calculateTotal() {

        double totalPrice = 0;
        for(OrderLine o : orderLineList) {

           totalPrice += o.getProduct().getPrice() * o.getQuantity();

        }
        return totalPrice;
    }

    public void saveToFile(String filename) {

        try {
            PrintStream printStream = new PrintStream(new FileOutputStream(filename, true));

            for(OrderLine o : orderLineList) {
                printStream.println(o);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException("File was not found, try and enter another file name", e);
        }


    }




}
