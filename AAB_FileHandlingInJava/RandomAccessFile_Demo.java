package AAB_FileHandlingInJava;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFile_Demo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile file = null;
        try{
            file = new RandomAccessFile("C:\\Java Bootcamp\\Programs__\\AAB_FileHandlingInJava\\Textfile.txt", "r");

            int c;

            while ((c=file.read())!=-1) {
                System.out.print((char)c);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
