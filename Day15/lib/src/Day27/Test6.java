package Day27;

import java.sql.*;
import java.util.Scanner;

public class Test6 {


    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入姓名");
        String sname = in.next();
        System.out.println("请输入密码");
        in.nextLine();
        String pwd = in.nextLine();
        User user = nullor(sname, pwd);
        if (user == null){
            System.out.println("查无此人");

        }else {
            System.out.println(user);
        }

    }

    private static User nullor(String sname, String pwd) throws SQLException, ClassNotFoundException {

        //1.注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2.建立连接
        Connection connection = DriverManager.getConnection("jdbc:mysql:///test","root","root");
        //3.准备sql
        String sql = "select * from test3 where sname = ? and pwd = ?";
        //4.创建命令发送器
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        //5.填充数据
        preparedStatement.setObject(1, sname);
        preparedStatement.setObject(2, pwd);
        //6.执行查询
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String passwdrd = resultSet.getString(3);
            User user = new User(id, name, passwdrd);
            return user;
        }
        preparedStatement.close();
        connection.close();
        resultSet.close();

        return null;
    }


}
