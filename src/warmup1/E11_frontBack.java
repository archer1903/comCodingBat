package warmup1;

public class E11_frontBack {
    public static void main(String[] args) {

/*        Given a string, return a new string where the first and last chars have been exchanged.

        frontBack("code") → "eodc"
        frontBack("a") → "a"
        frontBack("ab") → "ba"*/

        System.out.println(frontBack("eodc"));
    }
    public static String frontBack(String str) {
        String str2="";
        if(!str.isEmpty()){
            String[] arr=str.split("");
            String fLet=arr[0];
            String lLet=arr[str.length()-1];
            String temp=arr[0];
            arr[0]=lLet;
            arr[str.length()-1]=temp;
            for(String harf:arr){
                str2+=harf;
            }
            return str2;
        }
        return str2;
    }
}
