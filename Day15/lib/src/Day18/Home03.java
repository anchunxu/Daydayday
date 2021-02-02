package Day18;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class Home03 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int num = (int)(Math.random()*100+1);
            list.add(num);
        }
        System.out.println("10个随机值  " + list.toString());

        ArrayList list2 = new ArrayList<>();
           int i1 ;
        for (int i = 0; i < 3; i++) {
            int Max = list.get(0);
            for ( i1 = 0; i1 < list.size(); i1++) {
                int num = list.get(i1);
                if (Max<num){
                    Max = num;
                }
            }
            list2.add(Max);
            while (list.contains(i1)){
                list.remove(i1);
            }
        }
        System.out.println("前三个最大的： "+list2.toString());
    }
}
