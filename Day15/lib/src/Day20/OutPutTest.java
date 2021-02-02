package Day20;

import java.io.*;

public class OutPutTest {
    public static void main(String[] args) throws IOException {
        OutputStream out = new FileOutputStream("E:/e.txt",true);
        String s = "叫爸爸";
        byte[] bytes = s.getBytes();
        for (int i = 0; i < 10; i++) {
            out.write(bytes);
        }
        out.close();
    }
}
