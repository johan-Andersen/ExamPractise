package ChatØvelse2;

public class BankAccount {

    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public void deposit(double amount) {

        if(amount > 0) {
            this.balance += amount;
        }
        else {
            System.out.println("you cant deposit a negative amount");
        }

    }
    public void withdraw(double amount) {

        if(amount <= balance) {
            this.balance -= amount;
        }
        else {
            System.out.println("insufficient funds");
        }
    }

    public String printAccount() {

        return "Account number: " + accountNumber + ", Balance: " + balance;

    }

    public static void main(String[] args) {

        BankAccount bank = new BankAccount("ACAB124");

        System.out.println(bank.printAccount());

        bank.deposit(1000.8);

        System.out.println(bank.printAccount());

        bank.withdraw(501.92);

        System.out.println(bank.printAccount());


    }


}
