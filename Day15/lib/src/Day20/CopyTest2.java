package Day20;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyTest2 {
    public static void main(String[] args) {
        FileWriter wi = null;
        FileReader fi = null;
        try {
            fi = new FileReader("E:\\a.txt");
            wi = new FileWriter("E:\\e.txt");
            char [] c = new char[20];
            int len = 0;
            while ((len = fi.read(c))!= -1){
                System.out.println(new String(c));
                wi.write(c,0,len);
            }
            fi.close();
            wi.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
