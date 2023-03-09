package array1;

import java.lang.reflect.Array;

public class E18_biggerTwo {
/*
Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array. Return the array which has the largest sum. In event of a tie, return a.


biggerTwo([1, 2], [3, 4]) → [3, 4]
biggerTwo([3, 4], [1, 2]) → [3, 4]
biggerTwo([1, 1], [1, 2]) → [1, 2]*/

    public static void main(String[] args) {

         int array1 []= {1, 2};
         int array2 []= {3, 4};

        System.out.println("biggerTwo() = " + biggerTwo(array1,array2));

    }

    public static int[] biggerTwo(int[] a, int[] b) {
        int sum1=0;
        for (int i:a) {
            sum1+=i;
        }
        int sum2=0;
        for (int i:b) {
            sum2+=i;
        }

        return sum1>=sum2?a:b;
    }


}
