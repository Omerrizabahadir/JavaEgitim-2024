package thread_example06;
/*
Bu örnekte, BankAccount sınıfı içinde senkronize metotlarla hesap işlemleri gerçekleştirilir.
ThreadBankExample sınıfında ise iki farklı thread, hesaba para yatırma ve çekme işlemlerini yapar.
Senkronize metotlar sayesinde aynı anda yalnızca bir thread işlem yapabilir ve böylece hesap işlemleri güvenli bir şekilde yapılır.
Lütfen unutmayın ki bu örnekler basit anlatım amaçlıdır. Gerçek uygulamalarda daha fazla senkronizasyon ve thread güvenliği önlemleri gerekebilir.
 */

public class BankAccount {
    private int balance = 100;

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("deposit : " + amount + " | New Balance: " + balance);
    }

    public synchronized void withdraw(int amount) {
        if(balance >= amount) {
            balance -= amount;
            System.out.println("withdraw: " + amount + " | New Balance: " + balance);
        }else {
            System.out.println("Insufficient balance.");
        }
    }

    public int getBalance() {
        return balance;
    }   }

