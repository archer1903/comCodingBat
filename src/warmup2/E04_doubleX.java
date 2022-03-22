package warmup2;

public class E04_doubleX {
    public static void main(String[] args) {
        //  Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
        //
        //
        //        doubleX("axxbb") → true
        //        doubleX("axaxax") → false
        //        doubleX("xxxxx") → tru

        String[] arr={"axxbb","axaxax","xxxxx",
                "xaxxx","aaaax","","abc","x","xax","xaxx"};

        for(String ara:arr){
            System.out.println(doubleX(ara));
        }

    }

    public static boolean doubleX(String str) {

        int i=str.indexOf("x");

        if(str.contains("x")&&i+1<=str.length()-1){
            if(str.substring(i,i+1).equals("x") && str.substring(i+1,i+2).equals("x")) {
                return true;
            }
        }
        return false;
    }


}
