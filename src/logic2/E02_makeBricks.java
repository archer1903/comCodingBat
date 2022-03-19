package logic2;

public class E02_makeBricks {
    public static void main(String[] args) {

       boolean result= makeBricks(2, 1000000, 100003);
        System.out.println(result);

    }
    public static boolean makeBricks(int small, int big, int goal) {

        for (int i = 0; i <= small; i++) {

            for (int j = 0; j <= big; j++) {

                if (goal-(i + (j * 5))==0)  {

                    return true;
                }
            }
        }
        return false;
    }

}
