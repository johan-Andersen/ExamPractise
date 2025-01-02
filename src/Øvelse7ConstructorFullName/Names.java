package Øvelse7ConstructorFullName;

public class Names {

    private String firstName;
    private String middleName;
    private String lastName;

    public Names(String fullName) {

        String[] name = fullName.split("");
        this.firstName = name[0];
        if(name.length > 2) {
            this.middleName = name[1];
            this.lastName = name[2];
        }
        else {
            this.lastName = name[1];
        }
    }

   @Override
   public String toString() {
       if(middleName != null) {
           return firstName + " " + middleName + " " + lastName;
       }
       else {
           return firstName + " " + lastName;
       }
   }

}
