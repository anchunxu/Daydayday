package Day18;

import java.util.ArrayList;

public class Home04 {

    public static void main(String[] args) {
        ArrayList s =Test2();
        System.out.println("十个随机值"+s);
        ArrayList b = Test(list);
        System.out.println("前三个最大的"+b );
        System.out.println("删除后" + list);
    }
    public static ArrayList Test(ArrayList list){
        ArrayList Maxlist = new ArrayList();
        for (int i = 0; i < 3; i++) {
            Integer Maxnum = (Integer)list.get(0);
            for (int j = 0; j < list.size(); j++) {
                Integer num = (Integer) list.get(j);
                if (Maxnum < num){
                    Maxnum  = num;
                }
            }
            Maxlist.add(Maxnum);
          while (list.contains(Maxnum)){
                list.remove(Maxnum);
            }
        }
     return Maxlist;
    }
    public static ArrayList list = new ArrayList();
    public static ArrayList Test2(){

        for (int i = 0; i < 10; i++) {
            int num = (int)(Math.random()*100+1);
            list.add(num);
        }
       return list;
    }
}
