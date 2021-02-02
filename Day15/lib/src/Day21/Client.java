package Day21;

import javax.print.attribute.standard.Severity;
import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.30.35", 8888);
       OutputStream out =  socket.getOutputStream();
       PrintStream ps = new PrintStream(out);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream())) ;
        ps.println("啪的一下就连上了！很快啊!");
        Scanner in = new Scanner(System.in);
        while (true){
            System.out.println("你要说啥:");
            String mess = in.next();
            if (mess.equals("stop")){
                System.out.println("对话结束");
                break;
            }
            ps.println(mess);
            String s = bufferedReader.readLine();
            System.out.println("服务器发来消息:\n"+s);
        }

        ps.close();
        bufferedReader.close();
        socket.close();
//         while (true){
//            String s = bufferedReader.readLine();
//            System.out.println("服务器发来消息"+s);
//            Scanner in = new Scanner(System.in);
//            ps.println(in);
//                if(in.equals("stop")){
//                    ps.close();
//                    bufferedReader.close();
//                    socket.close();
//                    break;
//                }
 //       }

    }
}
