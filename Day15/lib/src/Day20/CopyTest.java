package Day20;

import java.io.*;

public class CopyTest {
    public static void main(String[] args) throws IOException {
        InputStream i1 = null;
        OutputStream o1 = null;
        try {
            i1 = new FileInputStream("E:\\java se\\day20数据结构&IO\\笔记\\1.7JDK.png");
            o1 = new FileOutputStream("E:\\a.jpg");
            byte[] b = new byte[20];
            int len = 0;
         while ((len = i1.read(b))!=-1) {
            // System.out.println(i1.read(b));
             o1.write(b,0,len);
         }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (i1!=null){
                i1.close();
            }
            if (o1!=null){
                o1.close();
            }
        }
    }
}
