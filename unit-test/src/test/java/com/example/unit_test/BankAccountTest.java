package com.example.unit_test;

import lombok.Getter;
import lombok.Setter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Getter
@Setter
public class BankAccountTest {

    private BankAccount account;

    @BeforeEach
    public void setUp() {
        account = new BankAccount("12345", 1000.0);
    }

    @Test
    public void getAccountNumberTest_successful_AccountNumber() {
        //given
        String accountNumber = "12345";
        double initialBalance = 50.0;

        BankAccount bankAccount = new BankAccount(accountNumber, initialBalance);

        //when
        String resultAccountNumber = bankAccount.getAccountNumber();

        //then assert for successful_AccountNumber
        assertEquals("12345", resultAccountNumber);

    }

    @Test
    public void getAccountNumberTest() {


        //assert for accountNumber_failure
        assertEquals("12345",account.getAccountNumber());

    }

    @Test
    public void getAccountNumberTest_successful() {
        String accountNumber = "12345";
        double initialBalance = 1000.0;

        BankAccount bankAccount = new BankAccount(accountNumber, initialBalance);

        //when
        double resultInitialBalance = bankAccount.getBalance();

        //then assert for getBalance_successful
        assertEquals(initialBalance, 1000.0);
    }

    @Test
    public void getBalance_failure() {


        //then assert for getBalance_failure
        assertEquals(1000.0, account.getBalance());
    }
    @Test
    public void depositTest_successful(){
        account.deposit(200.0);
        assertEquals(1200.00,account.getBalance());
    }

    @Test
    public void depositTest_zeroOrNegativeAmount() {
        Exception e = Assertions.assertThrows(IllegalArgumentException.class,
                () -> account.deposit(0.0));

        //beklenen hata mesajı kontrolü
        assertEquals("Deposit amount must be greater than zero", e.getMessage());

        //hesap bakiyesi değişmediğini kontrol et
        assertEquals(100.0, account.getBalance());

    }

    @Test
    public void withdrawTest_amountZeroOrNegative(){
        Exception e = Assertions.assertThrows(IllegalArgumentException.class,
                () -> account.withdraw(0.0));  //çekilecek para miktarı

        assertEquals("Withdraw amount must be greater than zero",e.getMessage());
    }

    @Test
    public void withdrawTest() {
        account.withdraw(100.0);

        assertEquals(900.0,account.getBalance());
    }
    @Test
    public void withdrawTest_insufficientFunds(){

        Exception e = Assertions.assertThrows(IllegalArgumentException.class,
                () -> account.withdraw(1100.0)); //çekilecek miktar. account 1000 old için 1000 üzerinde hata fırlatır

        assertEquals("Insufficient funds",e.getMessage());
    }
    @Test
    public void transferTest_failure(){
        Exception e = Assertions.assertThrows(IllegalArgumentException.class,
                ()-> account.transfer(new BankAccount("19898",0.0),1100.0));//Başka hesaba hesap no : 19898 1100 tl transfer etmek istiyor. hesapta 0 tl var.
            /*yukardaki işlemde 1100 tl yatırmak istiyor.1100 tl null olmadığı için  this.withdraw(amount); buraya gidecek.
            miktar balance tan fazla old için  "Insufficient funds" yazması gerekir
             */

        assertEquals("Insufficient funds",e.getMessage());//account = 1000. hesapta 1000tl var 1100 tl transfer edemezsin. hata verir
    }
    @Test
    public void transferTest_biggerAmount(){
        account.transfer(new BankAccount("3456",0.0),300.0);

        assertEquals(700.0,account.getBalance());
    }
    @Test
    public void transferTest_isNullTargetAccount(){

        Exception e = Assertions.assertThrows(IllegalArgumentException.class,
                ()-> account.transfer(null,0.0));

        assertEquals("Target account cannot be null",e.getMessage());
    }
    @Test
    public void transferTest_successful(){
        BankAccount targetAccount = new BankAccount("12345",0.0);
        account.transfer(targetAccount,200.0);
        assertEquals(800.0,account.getBalance()); //benim hesabımın kontrolü
        assertEquals(200.0,targetAccount.getBalance());//targetAccount kontrolü
    }



}



