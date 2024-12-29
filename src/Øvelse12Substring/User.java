package Øvelse12Substring;

import java.util.Random;

public class User {

    private String fullName;
    private String userID;

    public User(String fullName) {
        this.fullName = fullName;
        this.userID = null;
    }

    public boolean validUserID() {

        if(userID.length() != 8) {
            return false;
        }

        return Character.isLowerCase(userID.charAt(0)) &&
                Character.isLowerCase(userID.charAt(1)) &&
                Character.isLowerCase(userID.charAt(2)) &&
                Character.isLowerCase(userID.charAt(3)) &&
                Character.isDigit(userID.charAt(4)) &&
                Character.isDigit(userID.charAt(5)) &&
                Character.isDigit(userID.charAt(6)) &&
                Character.isDigit(userID.charAt(7));

    }

    public void createUserID() {

        String[] split = fullName.split(" ");

        String firstName = split[0];
        String lastName = split[split.length-1];

        Random random = new Random();

        int number = random.nextInt(9999); // + 1000 - this will make a number (4 digits) between 1000 and 9999;
        String numberString = Integer.toString(number);

        while(numberString.length() < 4) {
            numberString = "0" + numberString;
        }

       userID = firstName.substring(0, 2).toLowerCase() + lastName.substring(0, 2).toLowerCase() + numberString;


//        String formatted = String.format("%04d", number);

        /*
        Breaking Down %04d:

        % – Starts a format specifier.
            It tells Java that formatted output follows.
        0 – Pads the output with leading zeros (if needed) to meet the desired width.
        4 – Specifies the minimum width of the output (4 characters).
            If the number has fewer digits, it’s padded with zeros to make it 4 characters long.
        d – Formats the output as a decimal (integer) value.
            The value must be a whole number (int, long, short, etc.).
         */

//        userID = firstName.substring(0, 2) + lastName.substring(0, 2) + formatted;
    }

    public String printID() {
        return userID;
    }



}
