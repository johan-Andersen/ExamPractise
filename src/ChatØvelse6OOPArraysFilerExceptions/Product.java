package ChatØvelse6OOPArraysFilerExceptions;

public class Product {

    private String name;
    private double price;
    private String category;

    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Price: " + price + ", Category: " + category;
    }
}
