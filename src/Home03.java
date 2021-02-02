public class Home03 {
    public static void main(String[] args) {
        Cat1 cat1 = new Cat1();
        Cat1 dog1 = new Cat1();
        Thread thread = new Thread(cat1,"Thread-0: ");
        Thread thread2 = new Thread(dog1,"Thread-1: ");

        thread.start();
        thread2.start();
    }
}
class Cat1 implements Runnable{
private  static int num;
    @Override
    public void run() {
        for (;;){
            synchronized (""){
                try {
                "".notify();
                System.out.println(Thread.currentThread().getName()+ ++num);
                Thread.sleep(1000);

                    "".wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}
/*
class Dog1 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i< 100; i+=2){
            synchronized (""){
                "".notify();
                System.out.println(Thread.currentThread().getName()+i);
                try {
                    "".wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}*/
