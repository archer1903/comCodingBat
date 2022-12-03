package array2;

public class E06_has22 {
    /*
Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.


has22([1, 2, 2]) → true
has22([1, 2, 1, 2]) → false
has22([2, 1, 2]) → false*/

    public static void main(String[] args) {

        int arr[]={1,2,2};
        System.out.println("has22(arr) = " + has22(arr));

    }

    public static boolean has22(int[] nums) {

        for(int i=0;i+1<nums.length;i++){
            if(nums[i]==2&&nums[i+1]==2) return true;
        }
        return false;
    }

}
