package Day27;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test4 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //获取驱动
        Class.forName("com.mysql.jdbc.Driver");
        //建立连接
        Connection connection = DriverManager.getConnection("jdbc:mysql:///test","root","root");
        //创建sql
        String sql = "insert into test3 values (5,?)";
        //创建发送器
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setObject(1,"蔡徐坤");

        int i = preparedStatement.executeUpdate();
        System.out.println(i>0?"成功":"失败");
        connection.close();
        preparedStatement.close();
    }
}
