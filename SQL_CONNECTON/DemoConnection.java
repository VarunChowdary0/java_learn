package SQL_CONNECTON;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class DemoConnection {
    public static void main(String[] args) {
        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://12.1212/k", "boom", "GOOM");

            java.sql.Statement statement = connection.createStatement();
            
            ResultSet Res = statement.executeQuery("SELECT * FROM PROLE");

            while (Res.next()) {
                System.out.println(Res.getString("name"));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }    
}