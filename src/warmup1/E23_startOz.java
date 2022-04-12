package warmup1;

public class E23_startOz {

  /*  Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".


    startOz("ozymandias") → "oz"
    startOz("bzoo") → "z"
    startOz("oxx") → "o"*/
  public static void main(String[] args) {
      System.out.println(startOz("ozymandias"));
  }
    public static String startOz(String str) {
        String str2="";

        if(str.length()>=1)
            if(str.substring(0,1).equals("o")) str2+="o";
        if(str.length()>=2)
            if(str.substring(1,2).equals("z")) str2+="z";
        return str2;
    }

}
