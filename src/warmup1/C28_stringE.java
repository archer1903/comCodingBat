package warmup1;

public class C28_stringE {/*
Return true if the given string contains between 1 and 3 'e' chars.


stringE("Hello") → true
stringE("Heelle") → true
stringE("Heelele") → false*/

    public static void main(String[] args) {
        System.out.println(stringE("Hello"));
    }
    public static boolean stringE(String str) {

        int count=0;

        String[] arr=str.split("");

        for(String i:arr){
            if(i.equals("e")){
                count++;
            }
        }

        if(count>=1&&count<=3) return true;
        else return false;


    }
}
