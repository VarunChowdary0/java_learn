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
            ResultSet rs = statement.executeQuery("SELECT * FROM EMP");
            while(rs.next()){
                System.out.println
    (rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
                connection.close();
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
