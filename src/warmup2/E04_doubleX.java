package warmup2;

public class E04_doubleX {
    public static void main(String[] args) {
        //  Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
        //
        //
        //        doubleX("axxbb") → true
        //        doubleX("axaxax") → false
        //        doubleX("xxxxx") → tru

        String[] arr={"axxbb","axaxax","xxxxx"};

        for(String ara:arr){
            System.out.println(doubleX(ara));
        }

    }

    public static boolean doubleX(String str) {

        for (int i = 0; i < str.length()-3; i++) {

           if(str.substring(i,i+1).equals("x") && str.substring(i+1,i+2).equals("x")) {
               return true;
           }

        }
        return false;
    }


}
