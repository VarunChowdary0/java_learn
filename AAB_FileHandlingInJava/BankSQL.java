package AAB_FileHandlingInJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class BankSQL {
    public static void main(String[] args) throws SQLException{
        try{
            Class.forName("com.jdbc.mysql.Driver");

            Connection connection = DriverManager.getConnection(
                "jdbc://mysql//localhost:3360/iarebank", 
                "root",
            "groot");

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Username: ");
            String username = sc.nextLine();

            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);

            ResultSet resultSet = statement.executeQuery("SELECT * FROM allAccounts WHERE username = "+username);
            
                if(resultSet.next()){
                    System.out.print("Enter amunt to add: ");
                    Double am = sc.nextDouble();
                    Double bal = resultSet.getDouble("balance");
                    resultSet.updateDouble("balance", am+bal);
                    System.out.println("Current balance: "+bal+am);
                }
                else{
                    System.out.println("USER NOT FOUND !");
                }
                sc.close();
                connection.close();

            } 
        catch(Exception s){
            s.printStackTrace();
        }     
    }
}
