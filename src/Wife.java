public class Wife implements Runnable {
    Account account = new Account();
     public double a ;
    @Override
    public void run() {

        while (true) {
            Object obj = new Object();
            synchronized (obj){
            double d1 = (Math.random() * 10000) + 1;

            a = account.getBalance() - d1;

      System.out.println(Thread.currentThread().getName()+"本次妻子想取钱："+d1+"但是余额不足，等待....");
                try {
                    "".wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName()+"妻子开始取钱，目前账户状态： 账户" + account.getAccount()+",   余额："+a);
            }


        }

    }
}
