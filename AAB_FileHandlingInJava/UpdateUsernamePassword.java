package AAB_FileHandlingInJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateUsernamePassword {
    public static void main(String[] args) throws SQLException , ClassNotFoundException{
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/varun",
                "tomy",
                "po983dd[]+-"
            );    
            Statement statement = connection.createStatement();
            statement.executeUpdate("CREATE TABLE USERS(USERNAME VARCHAR(15) , PASSWORD VARCHAR(15))");

            connection.commit();

            statement.executeUpdate
            ("UPDATE USERS SET PASSWORD = "+"'99898'"+" WHERE USERNAME = 'VARUN099'");

            connection.commit();

            statement.executeUpdate("INSERT INTO USERS VALUES('TOMMY','209R39923')");
            connection.commit();

            statement.executeUpdate("DELETE FROM USERS WHERE USERNAME ='JERRY' ");
            connection.commit();

            ResultSet allUsers = statement.executeQuery("SELECT * FROM USERS");

            while (allUsers.next()) {
                System.out.println(allUsers.getString(1)+"  "+allUsers.getString(2));
            }

            connection.close();
    }
}
