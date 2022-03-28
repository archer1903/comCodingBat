package warmup2;

public class E08_arrayCount9 {
    public static void main(String[] args) {/*
        Given an array of ints, return the number of 9's in the array.


        arrayCount9([1, 2, 9]) → 1
        arrayCount9([1, 9, 9]) → 2
        arrayCount9([1, 9, 9, 3, 9]) → 3*/


        int[]nums={1, 9, 9, 3, 9};

        System.out.println(arrayCount9(nums));

    }

    public static int arrayCount9(int[] nums) {
        int count = 0;
        for (int gez:nums
             ) {
            if (gez==9)
                count++;
        }
        return count;
    }

}
