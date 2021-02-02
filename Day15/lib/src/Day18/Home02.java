package Day18;
import java.util.ArrayList;
import java.util.Scanner;
import static javafx.scene.input.KeyCode.T;
public class Home02 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int num = (int)(Math.random()*50+1);
            list.add(num);
        }
        System.out.println("乐透号码已生成");
        ArrayList list1 =  Peaon();
        System.out.println("您输入的号码为"+list1);
        System.out.println("乐透号码为"+list);
        int num1 = 0;
        for (Object o : list1) {
            if (list.contains(o)){
                num1++;
            }
        }
      System.out.println("猜对了"+num1+"个号码");
    }
        public  static ArrayList Peaon(){
            Scanner in = new Scanner(System.in);
            ArrayList<Integer> newList =new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                System.out.println("请输入第"+(i+1)+"个50以内的数字");
                int a = in.nextInt();
                if (a<=50){
                    newList.add(a);
                }else{
                    System.out.println("您的输入有误");
                    break;
                }
            }
            return newList ;
        }
    }


