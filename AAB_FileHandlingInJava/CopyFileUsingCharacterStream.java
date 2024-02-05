package AAB_FileHandlingInJava;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileUsingCharacterStream {
    public static void main(String[] args) throws IOException {
        FileReader fin = null;
        FileWriter fout = null;

        try{
            fin = new FileReader("C:\\\\Users\\\\SAI VARUN\\\\OneDrive\\\\Documents\\\\sem 3\\\\Java\\\\Text\\\\Test_11.txt");
            fout = new FileWriter("C:\\\\Users\\\\SAI VARUN\\\\OneDrive\\\\Documents\\\\sem 3\\\\Java\\\\Text\\\\Test_11(copy_2).txt");

            int c;

            while ((c = fin.read()) != -1) {
                fout.write(c);
            }
        }
        finally{
            if(fin != null){
                fin.close();
            }
            if(fout != null){
                fout.close();
                System.out.println("done");
            }
        }
    }
}
