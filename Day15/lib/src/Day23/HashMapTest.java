package Day23;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1,"张三");
        map.put(2,"蔡徐坤");
        map.put(3,"马保国");
        map.put(4,"肖战");
        map.put("???",2);
        System.out.println(map);
       // Map map1 = new HashMap();
        //map1.put(1,"哈哈");
     //   map1.put(2,"呵呵");
     //   map.putAll(map1);
        //System.out.println(map);
//        System.out.println(map.remove("???"));
//        System.out.println(map);


       // System.out.println(map.size());
        //System.out.println(map.get(999));
        System.out.println(map.containsKey(555));
        boolean b = map.containsKey(2);
        System.out.println(b);
        map.remove(b);
        System.out.println(map);
        System.out.println(map.containsValue("肖战"));

    }
}
