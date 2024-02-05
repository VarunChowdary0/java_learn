package AAB_FileHandlingInJava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileUsingByteStream{
    public static void main(String[] args) throws IOException {
        FileInputStream fin = null ;
        FileOutputStream fout = null;
        try{
            fin = new FileInputStream("C:\\Users\\SAI VARUN\\OneDrive\\Documents\\sem 3\\Java\\Text\\Test_11.txt");
            fout = new FileOutputStream("C:\\Users\\SAI VARUN\\OneDrive\\Documents\\sem 3\\Java\\Text\\Test_11(copy).txt");
            int c;

            while ((c=fin.read()) != -1) {
                fout.write(c);
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally{
            if(fin != null){
                System.out.println("Done");
                fin.close();
            }
            if(fout != null){
                fout.close();
            }
        }
    }
}
