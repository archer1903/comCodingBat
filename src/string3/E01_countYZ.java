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
countYZ("day fyyyz") → 2
* countYZ("!!day--yaz!!") → 2
* countYZ("y2bz") → 2*/
        System.out.println(countYZ("!!day--yaz!!"));

    }

    public static int countYZ(String str) {

        int counter = 0;
        String[] words = str.split("\\W");

        for (int i = 0; i < words.length; i++) {

            if (words[i] != "") {
                char lastChar = words[i].charAt(words[i].length() - 1);

                if (lastChar == 'y' || lastChar == 'z' || lastChar == 'Y' || lastChar == 'Z') {
                    counter++;
                }
            }
        }
        return counter;

    }
}
