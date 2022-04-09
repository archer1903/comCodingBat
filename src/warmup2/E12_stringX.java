package warmup2;

public class E12_stringX {
    public static void main(String[] args) {
        System.out.println(stringX("xxHxix"));
    }
    public static String stringX(String str) {

        if(str.length()<2) return str;

        String front=str.substring(0,1);
        String end=str.substring(str.length()-1);
        str=str.substring(1,str.length()-1).replaceAll("x","");
        return front+str+end;

    }

}
