package ChatØvelse1;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean isAdult() {

        if(age > 18) {
            return true;
        }
        else {
            return false;
        }
    }

    public String printInto() {

        return "Name: " + name + ", " + "Age: " + age;
    }

    public static void main(String[] args) {
        Person person = new Person("Johan andersen", 22);


        System.out.println(person.isAdult());

        System.out.println(person.printInto());

        Person person2 = new Person("Henrik andersen", 61);

        System.out.println(person2.isAdult());
        System.out.println(person2.printInto());


    }


}
