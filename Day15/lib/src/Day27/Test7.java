package Day27;

import java.sql.*;
import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入姓名");
        String sname = in.next();
        System.out.println("请输入密码");
        String pwd = in.next();

        User user = nullor(sname, pwd);
        if (user == null){

            System.out.println("查无此人");

        }else {
            System.out.println(user);
        }


    }

    private static User nullor(String sname, String pwd) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql:///test","root","root");
        String sql = "select * from test3 where sname = ? and pwd = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setObject(1,sname);
        preparedStatement.setObject(2,pwd);


        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String password = resultSet.getString(3);
            User user = new User(id,name,password);
            return user;
        }
        return null;
    }
}
