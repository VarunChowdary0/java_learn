package AAB_FileHandlingInJava;

import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class NoofisinFIle {
    public static void main(String[] args)  throws IOException{
        FileReader file = null;
        StringBuffer para = new StringBuffer("");
        int noOfis = 0;
        try{
            file = new FileReader("C:\\Java Bootcamp\\Programs__\\AAB_FileHandlingInJava\\Textfile.txt");
            int c;
            
            while ((c=file.read()) != -1) {
                para.append((char)c);
            }
            StringTokenizer strTzr = new StringTokenizer(para.toString());
            while (strTzr.hasMoreTokens()) {
                // System.out.println(strTzr.nextToken());
                if(strTzr.nextToken().equals("is")){
                    noOfis++;
                }
            }
            System.out.println("No of 'is' in file: "+noOfis);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            if(file!=null){
                file.close();
            }
        }
    }
}
