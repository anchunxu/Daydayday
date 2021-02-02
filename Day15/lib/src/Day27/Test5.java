package Day27;

import java.sql.*;

public class Test5 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //获取连接
        Connection connection = DriverManager.getConnection("jdbc:mysql:///test","root","root");
        //创建命令发送器
        Statement statement = connection.createStatement();
        //准备sql
        String sql = "select * from test3";
        //用命令发送器发送sql
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()){
            Object id = resultSet.getObject(1);
            Object sname = resultSet.getObject(2);
            System.out.println(id+"------->"+sname);


        }
        connection.close();
        statement.close();
        resultSet.close();


    }
}
