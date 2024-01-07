package Files__33;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFile {
    public static void main(String[] args) {
        FileInputStream fin = null;
        FileOutputStream fout = null;
        int i;
        if(args.length != 0){
            System.out.println("Usage : CopyFile from to");
            return;
        }
        try{
            fin = new FileInputStream("C:\\\\Users\\\\SAI VARUN\\\\OneDrive\\\\Documents\\\\User persona.txt");
            fout = new FileOutputStream("C:\\Users\\SAI VARUN\\OneDrive\\Documents\\User personaNEW.txt");
            do{
                i = fin.read();
                if(i != -1){
                    fout.write(i);
                }
            }
            while(i!=-1);
        }
         catch (Exception e) {
            System.out.println("I/o Error: "+e);
        }
        finally{
            try{
                if(fin != null){
                    fin.close();
                }
            }
            catch(Exception E){
                System.out.println("Error Closing Input File: "+E);
            }
            try{
                if(fout != null){
                    fout.close();
                }
            }
            catch(Exception E1){
                System.out.println("Error Closing Output File: "+E1);
            }
            System.out.println("Succefully Copied");
        }
    }
}