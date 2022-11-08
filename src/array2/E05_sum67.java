package array2;

public class E05_sum67 {
/*
Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending to the next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.


sum67([1, 2, 2]) → 5
sum67([1, 2, 2, 6, 99, 99, 7]) → 5
sum67([1, 1, 6, 7, 2]) → 4*/
    public static void main(String[] args) {
int []arr={1,2,2};
int []arr1={1, 2, 2, 6, 99, 99, 7};
int []arr2={1, 1, 6, 7, 2};
        System.out.println("sum67(arr) = " + sum67(arr));
        System.out.println("sum67(arr1) = " + sum67(arr1));
        System.out.println("sum67(arr2) = " + sum67(arr2));

    }
    public static int sum67(int[] nums) {

        int sum=0;
        boolean bl=true; //count

        for(int e:nums){

            if(e==6) {
                bl=false;  //dont count
                continue;
            }
            if(e==7&&!bl) {
                bl=true;  //count
                continue;
            }
            if(bl){
                sum+=e;
            }
        }
        return sum;
    }

}
