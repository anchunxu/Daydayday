import java.io.IOException;
import java.util.Scanner;

public class Account {
    private  String account = "217846";
    private double balance;

    public String getAccount() {
        return account;
    }
    public void setAccount(String account) {
        this.account = account;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "account='" + account + '\'' +
                ", balance=" + balance +
                '}';
    }

    public static void main(String[] args) {

        Husband h = new Husband();
        Thread t1 = new Thread(h,"本次丈夫开始存钱:");
        Wife w = new Wife();
        Thread t2 = new Thread(w,"本次妻子开始取钱:");
        t1.start();
        t2.start();

    }
}
