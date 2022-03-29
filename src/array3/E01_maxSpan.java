package array3;

import java.util.ArrayList;
import java.util.List;

public class E01_maxSpan {
    public static void main(String[] args) {
     /*   Consider the leftmost and righmost appearances of some value in an array.
     We'll say that the "span" is the number of elements between the two inclusive.
     A single value has a span of 1. Returns the largest span found in the given array.
     (Efficiency is not a priority.)


        maxSpan([1, 2, 1, 1, 3]) → 4
        maxSpan([1, 4, 2, 1, 4, 1, 4]) → 6
        maxSpan([1, 4, 2, 1, 4, 4, 4]) → 6*/

        int[] arr={1, 4, 2, 1, 4, 1, 4};
        System.out.println(maxSpan(arr));
    }

    public static int maxSpan(int[] arr) {
        int result=0;

        List<Integer> List = new ArrayList<Integer>();
        for (int i = 0; i <arr.length ; i++) {
            for (int j=arr.length-1;j>-1;j--) {
                    if(arr[i]==arr[j])
                         result=j-i+1;
                        List.add(result);

            }
        }
        int max=0;
        for (int i:List) {
            if(i>max) max=i;
        }
            return max;
    }

}
