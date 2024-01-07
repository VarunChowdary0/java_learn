package Files__33;

import java.io.FileReader;

public class ReadAFile_234{
    public static void main(String[] args) throws  Exception{
        try{
            FileReader fr = new FileReader("C:\\PROGRAMS\\JAVA\\Texts\\Text1.txt");
            int i;
            while((i=fr.read())!=-1){
                System.out.print((char)i);
            }
            }
        catch(Exception e){
            System.out.println(e);
        }
    }
}