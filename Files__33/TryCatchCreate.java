package Files__33;

import java.io.File;
import java.io.IOException;

public class TryCatchCreate {
   public static void main(String[] args)throws IOException {
        try{
            File F = new File("C:\\PROGRAMS\\JAVA\\Texts\\Text1.txt");
            try{
                if(F.createNewFile()){
                   System.out.println("File Created");
                }
                else{
                    System.out.println("File Already exists.");
                }
            }
            catch(Exception e){
                System.out.println("Exception : "+e);
            }
        }
        catch(Exception e){
            System.out.println("Exception: "+e);
        }
   } 
}
