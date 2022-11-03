package array2;

public class E04_sum13 {



    /*Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count.


sum13([1, 2, 2, 1]) → 6
sum13([1, 1]) → 2
sum13([1, 2, 2, 1, 13]) → 6

*/


    public static void main(String[] args) {




    }

    public static int sum13(int[] nums) {


        int sum = 0;

        if (nums==null) return sum;

        boolean bl=true;

        for(Integer i:nums){

            if(!bl) {
                bl=true; continue;
            }

            if(i==13) {
                bl=false;
                continue;
            }
            sum+=i;
        }

        return sum;
    }
}
