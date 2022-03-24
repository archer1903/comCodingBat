package array1;

import java.util.Arrays;

public class E07_reverse3 {
    public static void main(String[] args) {

/*      Given an array of ints length 3, return a new array with the elements in reverse order,
        so {1, 2, 3} becomes {3, 2, 1}.
        reverse3([1, 2, 3]) → [3, 2, 1]
        reverse3([5, 11, 9]) → [9, 11, 5]
        reverse3([7, 0, 0]) → [0, 0, 7]*/
        int nums[]= {1, 2, 3};
        System.out.println(Arrays.toString(reverse3(nums)));
    }
    public static int[] reverse3(int[] nums) {
        int[] nums2=new int[3];
        nums2[0]=nums[2];
        nums2[1]=nums[1];
        nums2[2]=nums[0];
        return nums2;
    }
}
