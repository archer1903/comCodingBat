package array1;

public class E13_no23 {


    /*
    *
Given an int array length 2, return true if it does not contain a 2 or 3.


no23([4, 5]) → true
no23([4, 2]) → false
no23([3, 5]) → false
    * */

    public static void main(String[] args) {
        int arr[]={4,5};
        int arr1[]={2,5};

        System.out.println("no23(arr) = " + no23(arr));
        System.out.println("no23(arr1) = " + no23(arr1));

    }

    public static boolean no23(int[] nums) {

        for(int e:nums){

            if(e==2||e==3) return false;
        }

        return true;



    }


}
