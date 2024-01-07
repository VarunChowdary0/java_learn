package Files__33;
import java.io.FileInputStream;
class WordCount{
    public static void main(String[] args)throws Exception {
        int spaces =  0 ;
        int Lines = 0 ;
        FileInputStream fs = new FileInputStream("C:\\Users\\SAI VARUN\\OneDrive\\Documents\\User persona.txt");
        while (true) {
            int o =  fs.read();
            System.out.print((char)o);
            if (o == -1) {
                break;
            }
            if(o == 32){
                spaces++;
            }
            if(o == 13){
                Lines++;
            }
        } 
        System.out.println();
        System.out.println("No of words :"+spaces+Lines);
        System.out.println("No of Spaces :"+spaces);
        System.out.println("No of Lines :"+Lines);
    }
    
}