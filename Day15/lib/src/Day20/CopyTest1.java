package Day20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTest1 {
    public static void main(String[] args) {
        FileInputStream is = null;
        FileOutputStream os = null;
        try {
            os = new FileOutputStream("E:\\a.png");
            is = new FileInputStream("E:\\java se\\day17数组+字符串\\笔记\\内存分析.png");
            byte [] b = new byte[20];
            int len = 0;
            while ((len = is.read(b))!=-1){
                os.write(b,0,len);
            }
            if (is != null){
                is.close();
            }
            if (os != null){
                os.close();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
