package ChatØvelse3;

public class Employee {

    private String navn;
    private String ansættelsesdato;
    private double løn;

    public Employee(String navn, String ansættelsesdato, double løn) {

        this.navn = navn;
        this.ansættelsesdato = ansættelsesdato;
        this.løn = løn;

    }

    public double årsindtægt() {

        return løn * 12;
    }

    public Employee højestIndtægt(Employee e1, Employee e2) {

        if(e1.årsindtægt() > e2.årsindtægt()) {
            return e1;
        }
        else {
            return e2;
        }
    }

    public String udskriv() {

        return "Navn: " + navn + ", Ansættelsesdato: " + ansættelsesdato + ", Løn: " + løn;

    }


    public static void main(String[] args) {

        Employee e1 = new Employee("johan andersen", "11/11/11", 12000);
        Employee e2 = new Employee("Henrik andersen", "11/11/89", 50000);

        System.out.println(e1.udskriv());
        System.out.println(e2.udskriv());

        System.out.println(e1.højestIndtægt(e1, e2));


    }



    public String toString() {

        return "Navn: " + navn + ", Ansættelsesdato: " + ansættelsesdato + ", Løn: " + løn;

    }



}
