import java.util.Random;

public class Husband implements Runnable{
  Account account = new Account();
    Wife s = new Wife();

    @Override
    public void run() {
        double a1 = 0;
        synchronized (""){
        while (true){
        double d = Math.random()*(10000-1+1)+1;

        a1 += d;
                "".notify();

            System.out.println(Thread.currentThread().getName()+"目前账户状态：账户："+account.getAccount()+"     余额："+ a1 );
        }

    }
}}