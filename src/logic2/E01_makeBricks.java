package logic2;

public class E01_makeBricks {
    public static void main(String[] args) {
//We want to make a row of bricks that is goal inches long.
// We have a number of small bricks (1 inch each) and
// big bricks (5 inches each). Return true if it is possible
// to make the goal by choosing from the given bricks.
// This is a little harder than it looks and can be done
// without any loops.

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
