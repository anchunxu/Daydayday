package Day21;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Clienet3 {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket(InetAddress.getLocalHost(),1111);
        BufferedReader bur = new BufferedReader(new InputStreamReader(s.getInputStream()));
        OutputStream out =s.getOutputStream();
        PrintStream ps = new PrintStream(out);
        Scanner in = new Scanner(System.in);
        System.out.println("请输入要查询的词语");
        String mess = in.next();
        ps.println(mess);
        String s1 = bur.readLine();
        System.out.println(s1);


    }
}
