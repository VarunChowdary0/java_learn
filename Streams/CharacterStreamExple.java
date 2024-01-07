package Streams;

import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamExple {
    public static void main(String[] args) {
        try{
            FileWriter FL = 
            new FileWriter("C:\\Users\\\\SAI VARUN\\\\OneDrive\\\\Documents\\\\CharacterSteram_123.txt");
            String data = " sekfbsb ubcusndsjdcbna jc";
            FL.write(data);
            FL.close();
            System.out.println("Writtern");
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
