package warmup2;

public class E09_arrayFront9 {
    public static void main(String[] args) {

        int[] arrNums={1,2,9,3,4};
        System.out.println(arrayFront9(arrNums));

    }
    public static boolean arrayFront9(int[] nums) {

        if(nums.length<4)
            for(int i=0;i<nums.length;i++){
                if(nums[i]==9) return true;
            }else{
            for(int i=0;i<4;i++){
                if(nums[i]==9) return true;
            }
        }

        return false;


    }

}
