import java.util.Scanner;

public class Test2 implements Runnable {
    Scanner in = new Scanner(System.in);

    int cound = 600;

    @Override
    public void run() {
        System.out.println("请输入取款数");

            int s1 = in.nextInt();
            synchronized ("") {
                if (cound - s1 >= 0) {
                    System.out.println(Thread.currentThread().getName() + "取款成功  余额为"+ (cound - s1) );
                    return;
                } else {
                    System.out.println(Thread.currentThread().getName() + "取款失败，余额不足" + (cound ) );
                    return;
                }
            }
        }
}

