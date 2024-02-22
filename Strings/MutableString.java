package Strings;

public class MutableString {
    public static void main(String[] args) {
        StringBuffer strBuf = new StringBuffer("This is buffer string");
        StringBuffer strBud2 = new StringBuffer("It is a mutable string");

        strBuf.append("\n"+strBud2);
        System.out.println((strBuf));
    }
}
