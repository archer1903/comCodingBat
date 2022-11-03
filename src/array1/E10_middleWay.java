package array1;

import java.util.Arrays;

public class E10_middleWay {

    /*
Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.


middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
*/

    public static void main(String[] args) {

        int[] arr1= {1, 2, 3};
        int[] arr2={4, 5, 6};

        System.out.println(Arrays.toString(middleWay(arr1, arr2)));


    }

    public static int[] middleWay(int[] a, int[] b) {

        int[] arr={a[1],b[1]};

        return arr;

    }


}
