package functional1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class E02_square {
    /*
Given a list of integers, return a list where each integer is multiplied with itself.


square([1, 2, 3]) → [1, 4, 9]
square([6, 8, -6, -8, 1]) → [36, 64, 36, 64, 1]
square([]) → []
*/
    public static void main(String[] args) {

     Integer [] array={1,2,3};

     List<Integer> newArray=square(Arrays.asList(array));

        System.out.println("newArray = " + newArray);


    }
    public static List<Integer> square(List<Integer> nums) {
        return nums.stream()
                .map(n-> n*n)
                .collect(Collectors.toList());


        // OR the equivalent java streams solution:
        // return nums.stream()
        //  .map(n -> n * 2)
        //  .collect(Collectors.toList());
    }

}
