package Day21;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class Server2 {
    public static void main(String[] args) throws IOException {
        HashMap<String, String> dictionary = new HashMap<String, String>();
        dictionary.put("星期一", "Monday");
        dictionary.put("星期二", "Tuesday");
        dictionary.put("星期三", "Wednesday");
        dictionary.put("星期四", "Thursday");
        dictionary.put("星期五", "Friday");
        dictionary.put("星期六", "Saturday");
        dictionary.put("星期七", "Sunday");
        ServerSocket serverSocket = new ServerSocket(1111);

        Socket s = serverSocket.accept();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(s.getInputStream())) ;
        OutputStream out =  s.getOutputStream();
        PrintStream ps = new PrintStream(out);
        while (true){
            String s1 = bufferedReader.readLine();
            String words = dictionary.get(s1);
            if (words!=null){
                ps.println(words);
            }else {
                System.out.println("好好看看你特娘的是不是写错了");
            }
            ps.close();
            s.close();
            bufferedReader.close();
        }



    }
}
