package logic1;

public class E10_old35 {
    public static void main(String[] args) {
/*
Return true if the given non-negative number is a multiple of 3 or 5, but not both. Use the % "mod" operator -- see Introduction to Mod


old35(3) → true
old35(10) → true
old35(15) → false*/

        System.out.println("old35(3) = " + old35(3));

    }
    public static boolean old35(int n) {

        return n > -1 && (n % 3 == 0 || n % 5 == 0) && n % 15 != 0;

    }

}
