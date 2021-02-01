import net.bytebuddy.build.ToStringPlugin;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.kodilla.jdbc.DbManager;

public class DbManagerTestSuite {
    @Test
    void testConnect() throws SQLException{
        //Given

        //When
        DbManager dbManager = new DbManager().getInstance();
        //Then
        Assertions.assertNotNull(dbManager.getConnection());
    }
    @Test
    void testSelectUsers() throws SQLException{
        //Given
        DbManager dbManager = new DbManager().getInstance();
        //When
        String sqlQuery = "Select * from USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);
        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getInt("ID")+ ", " + rs.getString("FIRSTNAME") + ", "
             + rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        Assertions.assertEquals(5,counter);
    }
    @Test
    void testSelectUsersAndPosts() throws SQLException{
        //Given
        DbManager dbManager = new DbManager().getInstance();
        //When
        String sqlQuery = "SELECT U.FIRSTNAME, U.LASTNAME, COUNT(*) AS POSTS_NUMBER\n" +
                "FROM USERS U JOIN POSTS P ON U.ID = P.USER_ID\n" +
                "GROUP BY P.USER_ID\n" +
                "HAVING COUNT(*) >= 2\n" +
                "ORDER BY U.LASTNAME, U.FIRSTNAME";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet result = statement.executeQuery(sqlQuery);
        //Then
        int counter = 0;
        while (result.next()) {
            System.out.println((counter + 1) + ", " + result.getString("FIRSTNAME") +", "+ result.getString("LASTNAME")
                    +", " + result.getInt("POSTS_NUMBER"));
            counter++;
        }
        result.close();
        statement.close();
        Assertions.assertEquals(2,counter);
    }
}
