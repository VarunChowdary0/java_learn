package AAB_FileHandlingInJava;

import java.util.Scanner;
import java.io.File;

public class TheFIleClass {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter path: ");
        String fname = Sc.nextLine();
        Sc.close();
        File f = new File(fname);

        System.out.println("File Name: "+f.getName());
        System.out.println("Path : "+f.getPath());
        System.out.println("Anbolute path : "+f.getAbsolutePath());
        System.out.println("Parent :"+f.getParent());
        System.out.println("Exists : "+f.exists());
        if(f.exists()){
            System.out.println("is Writtable: "+f.canWrite());
            System.out.println("is Readable: "+f.canRead());
            System.out.println("Id Executable: "+f.canExecute());
            System.out.println("Full size in bytes : "+f.length());
        }
    }
}
