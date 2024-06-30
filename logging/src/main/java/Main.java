public class Main {


    public static void main(String[] args) {
        BankAccount bankAccount1= new BankAccount("12345",1000.00);
        BankAccount bankAccount2 = new BankAccount("9876",500.00);

        bankAccount1.deposit(500.00);
        bankAccount1.withdraw(200.00);

        bankAccount2.withdraw(600.00);

        System.out.println("Bankaccount 1 : "+bankAccount1);
        System.out.println("Bankaccount 2 : "+bankAccount2);

    }
}
