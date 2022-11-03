public class StringLoops
{
    // default constructor; no instance variables
    public StringLoops() {

    }
    int count = 0;
    public int countCharacters(String character, String searchString) {
        for (int i = 0; i < searchString.length(); i++) {
            if (searchString.substring(i, i + 1) == character) {
                count++;
            }
        }
        return count;
    }

    String newString = "";
    public String reverseString(String origString){
        for (int i = origString.length()-1; i > -1; i--) {
            newString = newString + origString.charAt(i);
        }
        return newString;
    }

    String newString2 = "";
    public String reverseString2(String origString){
        for (int i = 0; i ; i++) {
            newString2 = newString2 + origString.charAt(i);
        }
        return newString2;
    }

}