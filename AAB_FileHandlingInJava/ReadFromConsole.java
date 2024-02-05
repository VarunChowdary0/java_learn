package AAB_FileHandlingInJava;

import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFromConsole {
    public static void main(String[] args) throws IOException{
        InputStreamReader cin = null;
        try{
            cin = new InputStreamReader(System.in);
            System.out.print("Enter Characters, and q to exit: ");
            char c;
            do{
                c = (char) cin.read();
                System.out.print(c);
            }
            while(c != 'q');
        }
        finally{
            if(cin != null){
                cin.close();
            }
        }
    }
}
