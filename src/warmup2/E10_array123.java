package warmup2;

public class E10_array123 {
    public static void main(String[] args) {

        int[] arr={1,1,2,3,1};
        System.out.println(array123(arr));
    }
    public static boolean array123(int[] nums) {
        for(int i=0;i+2<nums.length;i++){

            if( nums[i]==1 && nums[i+1]==2&& nums[i+2]==3)
                return true;
        }   return false;

    }

}
