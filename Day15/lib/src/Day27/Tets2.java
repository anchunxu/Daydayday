package Day27;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Tets2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql:///test","root","root");
        String sql = "insert into test3 values(3,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setObject(1,"李四");
        int i = preparedStatement.executeUpdate();
        //System.out.println(i>0?"");
        connection.close();
        preparedStatement.close();
    }

}
