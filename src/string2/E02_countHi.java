package string2;

public class E02_countHi {
    public static void main(String[] args) {
        //  Return the number of times that the string "hi"
        //  appears anywhere in the given string.

        //        countHi("abc hi ho") → 1
        //        countHi("ABChi hi") → 2
        //        countHi("hihi") → 2

        System.out.println(countHi("abc hi ho"));
    }

    public static int countHi(String str) {

        String str2="hi";
        int counter=0;
        for(int i=0;i<str.length()-1;i++){
            if(str2.equals(str.substring(i,i+2)))
                counter++;
        }
        return counter;
    }


    //better one here
    //  // Loop to length-1 so we can access index i and i+1 in the loop.
    //  for (int i = 0; i < (str.length() - 1); i++) {
    //    if (str.substring(i, i+2).equals("hi")) count++;
    //  }
    //  return count;
    //}



}
