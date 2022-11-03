package array1;

import java.util.Arrays;

public class E12_has23 {
    /*Given an int array length 2, return true if it contains a 2 or a 3.


has23([2, 5]) → true
has23([4, 3]) → true
has23([4, 5]) → false
*/

    public static void main(String[] args) {
        int nums1[] = {2, 5};
        int nums2[] = {4, 3};
        int nums3[] = {4, 5};


        System.out.println((has23(nums1)));
        System.out.println((has23(nums2)));
        System.out.println((has23(nums3)));


    }

    public static boolean has23(int[] nums) {

        for (Integer i : nums)
        {
            if (i == 2 || i == 3) return true;
        }
        return false;
    }


}
