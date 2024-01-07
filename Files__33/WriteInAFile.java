package Files__33;

import java.io.FileWriter;
import java.util.Scanner;

public class WriteInAFile {
    public static void main(String[] args) {
        try{
            FileWriter f = new FileWriter("C:\\PROGRAMS\\JAVA\\Texts\\Text1.txt");
            try{
                Scanner Sc = new Scanner(System.in);
                System.out.println("Enter : ");
                String text = Sc.nextLine();
                f.write(text);
            }
            finally{
                f.close();
            }
            System.out.println("Written in file");
        }
        catch(Exception e){
            System.out.println("exe: "+e);
        }
    }
}
