package Files__33;

import java.io.File;
import java.io.IOException;

public class CreatingFile {
   public static void main(String[] args)throws IOException {
        File F = new File("\\Text1.txt");
        if(F.createNewFile()){
            System.out.println("File Created");
        }
        else{
            System.out.println("File Already exists.");
        }
   } 
}
