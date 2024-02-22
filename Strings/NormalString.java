package Strings;

public class NormalString {
    public static void main(String[] args) {
        char[] chs = {'v','a','r','u','n'};
        // String is unmutable.
        String name = new String(chs);
        System.out.println(name); //varun
        System.out.println(name.length()); // 5
        System.out.println(name.substring(1)); // arun
        System.out.println(name.charAt(2)); // r
        System.out.println(name.indexOf("run")); // 2
        System.out.println(name.toUpperCase()); // VARUN
        System.out.println(name.compareTo(name)); // 0
        System.out.println(name.equals(new String("varun"))); // true
    }
}
