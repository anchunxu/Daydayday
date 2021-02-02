package Day28;

import org.apache.commons.dbutils.QueryRunner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Queue;

public class Test1 {

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql:///test","root","root");
        QueryRunner queryRunner = new QueryRunner();
        String sql = "insert into test3 values (4,?)";
        Object [] param = {1,"蔡徐坤"};
        int update = queryRunner.update(connection, sql, param);
    }
}
