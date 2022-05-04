package warmup1;

public class E24_intMax {
    public static void main(String[] args) {
        /*
Given three int values, a b c, return the largest.


intMax(1, 2, 3) → 3
intMax(1, 3, 2) → 3
intMax(3, 2, 1) → 3
*/
        System.out.println(intMax(1,2,3));
    }
    public static int intMax(int a, int b, int c) {
        if(a>b&&a>c) return a;
        if(b>a&&b>c) return b;
        return c;
    }

}
