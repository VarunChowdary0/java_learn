package Enum;

public class EnumExample {
    public enum Directions__ { NORTH , SOUTH , EAST , WEST }

    public static void main(String[] args) {
        for (Directions__ D : Directions__.values()) {
            System.out.println(D);
        }
        System.out.println();

        System.out.println(Directions__.NORTH);
    }
}
