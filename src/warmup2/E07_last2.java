package warmup2;

public class E07_last2 {
    public static void main(String[] args) {

/*        Given a string, return the count of the number of times that a substring length 2 appears in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).


        last2("hixxhi") → 1
        last2("xaxxaxaxx") → 1
        last2("axxxaaxx") → 2*/

        System.out.println(last2("hixxhi"));
    }
    public static int last2(String str) {
        if(str.length()<3) return 0;
        String last2Let=str.substring(str.length()-2);
        int count=0;
        for(int i=0;i<str.length()-2;i++){

            if(last2Let.equals(str.substring(i,i+2)))
                count++;
        }
        return count;

    }

}
