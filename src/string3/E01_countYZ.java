package string3;


public class E01_countYZ {
    public static void main(String[] args) {

/*
* Given a string, count the number of words ending in 'y' or 'z' --
* so the 'y' in "heavy" and the 'z' in "fez" count, but not the 'y' in
* "yellow" (not case sensitive). We'll say that a y or z is at the end of
* a word if there is not an alphabetic letter immediately following it.
* (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
* countYZ("fez day") → 2
countYZ("day fez") → 2
countYZ("day fyyyz") → 2*/

        System.out.println(countYZ("fez day"));

    }

    public static int countYZ(String str) {

        int counter = 0;
        String space = " ";
        String[] words = str.split("\\s+");

        for (int i = 0; i < words.length; i++) {

            char lastChar = words[i].charAt(words.length - 1);

            if (lastChar == 'y' || lastChar == 'z' || lastChar == 'Y' || lastChar == 'Z') {
                counter++;
            }
        }

/*        int indy = str.indexOf('y');
        int indz = str.indexOf('z');
        int indY = str.indexOf('Y');
        int indZ = str.indexOf('Z');

        if (!space.equals(str.charAt(indy + 1))) {
            counter++;
        }
        if (!space.equals(str.charAt(indz + 1))) {
            counter++;
        }
        if (!space.equals(str.charAt(indY + 1))) {
            counter++;
        }
        if (!space.equals(str.charAt(indZ + 1))) {
            counter++;
        }*/

        return counter;

    }

}
