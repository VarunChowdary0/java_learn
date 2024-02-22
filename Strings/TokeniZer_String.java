package Strings;

import java.io.Console;
import java.util.StringTokenizer;

public class TokeniZer_String {
    public static void main(String[] args) {
        Console c = System.console();
        System.out.print("Enter a line: ");
        StringTokenizer strTkzr = new StringTokenizer(c.readLine() ) ;

        while (strTkzr.hasMoreTokens()) {
            System.out.println(strTkzr.nextToken());
        }
    }
}