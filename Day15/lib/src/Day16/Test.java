package Day16;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test {
   String [] a = {"123 ","321","abc","bcd"};
    public static void main(String[] args) {
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add("你好");
        coll.add("世界");
       // coll.remove("世界");
        //System.out.println(coll);

        Iterator iterator = coll.iterator();
        // System.out.println(iterator.hasNext());
        //System.out.println(iterator);
       while (iterator.hasNext()){
           Object obj = iterator.next();
           if ("世界".equals(obj)){
               iterator.remove();
           }
        }
       iterator = coll.iterator();
       while (iterator.hasNext()){
           System.out.println(iterator.next());
       }
    }
}
