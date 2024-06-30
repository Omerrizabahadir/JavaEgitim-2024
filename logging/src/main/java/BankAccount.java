import java.util.logging.Logger;

public class BankAccount {

    private static final Logger logger = Logger.getLogger(BankAccount.class.getName());

    private String accountNumber;
    private double balance;


    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        logger.info("Hesap " + accountNumber + "'a " + amount + " TL yatırıldı. Yeni bakiye: " + balance);

    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            logger.info("Hesap "+ accountNumber+"'dan "+amount+ "TL çekilmiştir.Yeni Bakiye : "+balance);
        } else {
            logger.info("Yetersiz bakiye.Hesap "+accountNumber+"'da yeterli bakiye bulunmuyor.Çekilmek istenen miktar : "+amount+" TL");
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
