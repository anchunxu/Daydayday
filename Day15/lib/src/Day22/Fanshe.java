package Day22;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Fanshe {
    public static void main(String[] args) throws Exception {
        Class clazz = Class.forName("Day22.Cat");
        //Constructor d = clazz.getDeclaredConstructor(String.class,int.class);
      //  Object o = d.newInstance("张三",18);

        Field field = clazz.getDeclaredField("name");

        Object o = clazz.newInstance();
        field.set("name","张三");
        Object o1 = field.get("name");
        System.out.println("o = " + o1);


    }

}
class Cat{
    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String name ;
    private int age ;

    public Cat(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public Cat() {
    }
}
class Dog{




}
