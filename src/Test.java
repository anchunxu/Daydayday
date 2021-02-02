public class Test {

    public static void main(String[] args) {
        Test2 a1 = new Test2();
        Thread s = new Thread(a1,"张三");
        Thread s2 = new Thread(a1,"张三媳妇");
        s.start();
        s2.start();
    }

}
