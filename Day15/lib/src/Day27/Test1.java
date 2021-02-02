package Day27;

import java.sql.*;

public class Test1 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
       Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql:///test","root","root");
        String sql = "insert into test3 values(2,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setObject(1,"张三");
        int i = preparedStatement.executeUpdate();
        System.out.println(i>0?"成功":"失败");
        preparedStatement.close();
        connection.close();

    }
}
