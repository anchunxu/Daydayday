package Day20;

import java.io.*;
import java.util.Date;

public class DataOutTest {
    public static void main(String[] args) throws IOException {
        String name = "张三";
        int age = 300;
        char gender = '男';
        int energy = 5000;
        double price = 75.5;
        boolean relive = true;
        DataOutputStream di = new DataOutputStream(new FileOutputStream("E:\\新建文本文档.dat"));
        di.writeUTF(name);
        di.writeByte(age);
        di.writeChar(gender);
        di.writeInt(energy);
        di.writeDouble(price);
        di.writeBoolean(relive);
        di.close();

    }

}
class Test1{
    public static void main(String[] args) throws IOException {
        DataInputStream i1 = new DataInputStream(new FileInputStream("E:\\新建文本文档.dat"));
        String s = i1.readUTF();
        byte b = i1.readByte();
        char c = i1.readChar();
        int i = i1.readInt();
        double v = i1.readDouble();
        boolean b1 = i1.readBoolean();
        System.out.println(s +"" + b+""+c+"" +i+""+v+""+b1);
        i1.close();
    }
}
