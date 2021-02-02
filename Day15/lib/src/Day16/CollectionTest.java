package Day16;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
public class CollectionTest  {
    public static void main(String[] args){
        Collection coll = new ArrayList();
        coll.add(1234);
        coll.add(333);
        coll.add(967);
        coll.add("真好");
        //System.out.println(coll);
        //coll.contains()  判断当前集合是否有此元素 返回布尔类型的值
        //System.out.println(coll.contains(12334));
        //coll.containsAll   判断是否包含另一个集合
        Collection coll1 = new ArrayList();
        coll1.add(1234);
        coll1.add(333);
        coll1.add("真好");
       // System.out.println(coll.containsAll(coll1));
        System.out.println(coll);
        coll.remove(1234);
        //coll.remove()   删除指定元素
        System.out.println(coll);
    }
}
