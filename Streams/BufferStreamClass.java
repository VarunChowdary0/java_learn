package Streams;

import java.io.FileOutputStream;
import java.io.IOException;

public class BufferStreamClass {
    public static void main(String[] args) {
        try{
            FileOutputStream outStream = 
            new FileOutputStream("C:\\Users\\\\SAI VARUN\\\\OneDrive\\\\Documents\\\\NewFIle123.txt");
            String data = "k'\r\n" + //
                    "            onChange={(e)=>{setLink(e.target.value)}} \r\n" + //
                    "            className='w-[80%] px-4 outline-none' type=\"text\" value={link}/>\r\n" + //
                   
                    "";
            byte[] byteArr = data.getBytes(); // convert the data into bytes
            outStream.write(byteArr); // write in file
            outStream.close();        // close stream
            System.out.println("Written");
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
