package Øvelse12Substring;

public class Main {

    public static void main(String[] args) {


        User user = new User("Johan Ingemann Andersen");

        user.createUserID();

        System.out.println(user.validUserID());

        System.out.println(user.printID());

    }

}
