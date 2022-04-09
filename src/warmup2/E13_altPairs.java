package warmup2;

public class E13_altPairs {
    public static void main(String[] args) {
        System.out.println(altPairs("kitten"));
    }
    public static String altPairs(String str) {

        String str2="";

        for(int i=0;i<str.length();i+=4){

            int till=i+2;
            if(i+2>str.length())
                till=str.length();

            str2+=str.substring(i,till);



        }

        return str2;

    }
}
