package ConsoleInp;

import java.io.Console;

public class ConsoleExample {
    public static void main(String[] args) {
        Console C = System.console();
        System.out.print("Enter name: ");
        String MyName = C.readLine();
        System.out.println("Hey, "+MyName+" !");
    }
}
