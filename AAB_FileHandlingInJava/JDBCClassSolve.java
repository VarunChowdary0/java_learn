package AAB_FileHandlingInJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCClassSolve {
    public static void main(String[] args) {
        try{
            Class.forName("class.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection
            ("jdbc:mysql://localhost:3306/varun", "Root", "Foot");
            Statement statement = connection.createStatement();
            statement.executeUpdate("CREATE TABLE EMP(ID INT(10) ,NAME VARCHAR(30), AGE INT )");
            connection.commit();
            ResultSet rs = statement.executeQuery("SELECT * FROM EMP");
            ResultSet under18 = statement.executeQuery("SELECT * FROM EMP WHERE AGE <= 18");
            while(rs.next()){
                System.out.println
    (rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
            }

            System.out.println("UNDER 18");
            while (under18.next()) {
                System.out.println(
                    under18.getString(1)+" "+under18.getString(2)+" "+under18.getInt(3) 
                );
            }

            connection.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
