package string2;


public class E03_catDog {
    public static void main(String[] args) {


        String str="catdog";


        int countCat=0;
        int countDog=0;
        int lastIndex=0;
        String findCat="cat";
        String findDog="dog";

        while(lastIndex!=-1){
            lastIndex=str.indexOf(findCat,lastIndex);
            if(lastIndex!=-1){
                countCat++;
                lastIndex+=findCat.length();
            }
        }
        while(lastIndex!=-1){
            lastIndex=str.indexOf(findDog,lastIndex);
            if(lastIndex!=-1){
                countDog++;
                lastIndex+=findDog.length();
            }
        }



        if(countCat==countDog) System.out.println(true);
        else System.out.println(false);
        }

    }
