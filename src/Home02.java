public class Home02 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Thread thread = new Thread(cat,"偶数线程");
        Dog dog = new Dog();
        Thread thread1 = new Thread(dog,"奇数线程");
        try {
            thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            thread1.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.start();
        thread1.start();
    }
}
class Cat implements Runnable{

    private int num = 0;
    public void run() {
        synchronized ("") {
            for (int i = 0; i < 10; i++) {
                for (int j = 1; j <= 5; j++) {

                    num += 2;


                    System.out.println(Thread.currentThread().getName() + "--------->" + "第" + j+ "个" + num);

                }
            }

        }
    }

}
class Dog implements Runnable {
    private int num = -1;

    @Override
    public void run() {
        synchronized ("") {
            for (int i = 0; i < 10; i++) {
                for (int j = 1; j <= 5; j++) {

                    num += 2;
                    System.out.println(Thread.currentThread().getName() + "--------->" + "第" + j + "个" + num);


                }
            }
        }
    }
}
