package Day21;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
class Server1 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(4567);
        Socket socket = serverSocket.accept();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream())) ;

        OutputStream os = socket.getOutputStream();
        PrintStream ps = new PrintStream(os);
        Scanner in = new Scanner(System.in);
        while (true) {

            String s = bufferedReader.readLine();
            System.out.println("客户端发来消息:\n" + s);
            System.out.println("你要说啥:");
            String mess = in.next();
            ps.println(mess);
            if(s.equals("stop") ){
                System.out.println("对话结束");
                break;
            }
        }
        ps.close();
        bufferedReader.close();
        socket.close();
//        while (true){
//            String s = bufferedReader.readLine();
//            System.out.println("客户端发来消息" + s);
//            System.out.println("请输入返回的消息");
//            ps.println(mess);
//            if (mess.equals("stop")){
//                ps.close();
//                socket.close();
//                bufferedReader.close();
//                break;
//            }
//        }

    }
}
