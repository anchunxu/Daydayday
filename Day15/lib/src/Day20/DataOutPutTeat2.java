package Day20;

import java.io.*;

public class DataOutPutTeat2 {
    public static void main(String[] args) throws IOException {
        String name = "巫师";
        int age = 300;
        char gender = '男';
        int energy = 5000;
        double price = 75.5;
        boolean relive = true;

        DataOutputStream dos = new DataOutputStream(new FileOutputStream("E:\\新建文本文档.dat"));
        dos.writeUTF(name);
        dos.writeInt(age);
        dos.writeChar(gender);
        dos.writeInt(energy);
        dos.writeDouble(price);
        dos.writeBoolean(relive);
        dos.close();
    }



    public void reload() throws IOException {
        DataInputStream dis = new DataInputStream(new FileInputStream("E:\\新建文本文档.dat"));
        String name = dis.readUTF();
        int age = dis.readInt();
        char gender = dis.readChar();
        int energy = dis.readInt();
        double price = dis.readDouble();
        boolean relive = dis.readBoolean();

        System.out.println(name + "," + age + "," + gender + "," + energy + "," + price + "," + relive);

        dis.close();
    }

    {
    }
}

