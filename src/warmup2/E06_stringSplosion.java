package warmup2;

public class E06_stringSplosion {
    public static void main(String[] args) {

/*      Given a non-empty string like "Code" return a string like "CCoCodCode".

        stringSplosion("Code") → "CCoCodCode"
        stringSplosion("abc") → "aababc"
        stringSplosion("ab") → "aab"*/



        System.out.println( stringSplosion("Code"));
    }

    public static String stringSplosion(String str) {
        String str2="";
        for (int i = 1; i <=str.length(); i++) {

            str2+=str.substring(0,i);

        }
        return str2;

    }


}
