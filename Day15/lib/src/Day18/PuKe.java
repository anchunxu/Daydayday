package Day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class PuKe {


    public static void main(String[] args) {
         String[] dian =  {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
         String[] hua = {"黑桃","红桃","方片","梅花"};
         String[] wang = {"大王","小王"};
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < dian.length; i++) {
            for (int i1 = 0; i1 < hua.length; i1++) {
                list.add(dian[i]+ hua[i1]);
            }

        }
        for (int i = 0; i < wang.length; i++) {
            list.add(wang[i]);
        }
        System.out.println(list.toString());
        System.out.println();
        System.out.println("发牌：");

        Random rand = new Random();
        ArrayList<String> one = new ArrayList<String>();
        for (int i = 0; i < 11; i++) {
           // one.add(list.remove(rand.nextInt(list.size())));
            int s1 = list.size();
            int i1 = rand.nextInt(s1);
            one.add(list.remove(i1));
        }

        ArrayList<String> two = new ArrayList<String>();
        for (int i = 0; i < 11; i++) {
            two.add(list.remove(rand.nextInt(list.size())));
        }

        ArrayList<String> three = new ArrayList<String>();
        for (int i = 0; i < 11; i++) {
            three.add(list.remove(rand.nextInt(list.size())));
        }

        ArrayList<String> four = new ArrayList<String>();
        for (int i = 0; i < 11; i++) {
            four.add(list.remove(rand.nextInt(list.size())));
        }

        System.out.println("第1个人：" + one);
        System.out.println("第2个人：" + two);
        System.out.println("第3个人：" + three);
        System.out.println("第4个人：" + four);
        System.out.println("剩余：" + list);

    }
}



