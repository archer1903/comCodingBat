package warmup2;

public class E11_stringMatch {
/*
Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.


stringMatch("xxcaazz", "xxbaaz") → 3
stringMatch("abc", "abc") → 2
stringMatch("abc", "axc") → 0*/
    public static void main(String[] args) {


        System.out.println(stringMatch("xxcaazz","xxbaaz"));
    }
    public static int stringMatch(String a, String b) {
        int count=0;
        int min=a.length();
        if(b.length()<a.length()) min=b.length();

        for(int i=0;i<min-1;i++){
            if(a.substring(i,i+2).equals(b.substring(i,i+2)))
                count++;
        }
        return count;

    }

}
