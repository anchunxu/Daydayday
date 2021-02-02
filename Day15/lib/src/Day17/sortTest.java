package Day17;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.*;

public class sortTest {


    public static void main(String[] args) {
        int [] arr = {8,7,6,5,4,3,2,1};
        String s = Arrays.toString(arr);
        //System.out.println(s);
       // System.out.println(Arrays.toString(arr));
        Arrays.sort(arr,0,8);
        System.out.println(Arrays.toString(arr));

    }
}

class Test1{
    public static void main(String[] args) {
        int [] arr = new int [5];
        System.out.println(Arrays.toString(arr));
        Arrays.fill(arr,9);
        System.out.println(Arrays.toString(arr));
        Arrays.fill(arr,0,4,33);
        System.out.println(Arrays.toString(arr));
        String [] s = {"蔡徐坤","肖战","马保国","川建国"};
        String[] s1 = Arrays.copyOf(s, 3);
        String[] s2 = Arrays.copyOfRange(s, 1, 3);
        System.out.println(Arrays.toString(s));
        System.out.println(Arrays.toString(s1));
        System.out.println(Arrays.toString(s2));
    }
}
class Test2{
    public static void main(String[] args) {
        int [] arr = {1,4,2,4,25,1,451,5,32,5332};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr, 1));
        System.out.println(Arrays.toString(Arrays.copyOf(arr, 4)));
        String a = "你好";
    }
}
class Test3 {
    public static void main(String[] args) {
        List<String> coll1 = new ArrayList();
        coll1.add("蔡徐坤");
        coll1.add("坤坤的篮球");
       // System.out.println(coll1.toString());
        Iterator iterator = coll1.iterator();
            while (iterator.hasNext()){
                Object obj = iterator.next();
                System.out.println(obj);
            }
    }
}

class Test4{


    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("坤坤");
        list.add("坤坤");
        list.add("坤坤");
        list.add("坤坤");
        list.add("坤坤");
        list.add("坤坤");
        list.add("坤坤");
        list.add("坤坤");
        list.add("坤坤");
        list.add("坤坤");
       // list.forEach(System.out::println);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        for (Object o : list) {
            System.out.println(o);
        }
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));

        }
//        for (iterator.n)
    }



}
