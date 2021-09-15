public class MyMain {

    // Changes a capital letter to a lowercase letter
    // If the char is not an uppercase letter, 
    // it is returned unchanged. 
    public static char toLower(char ch) {
        if (ch < 'A' || ch > 'Z') {
            return ch;
        }
        else {
            return (char) (ch -'A' + 'a');
        }
    }

    // Changes a lowercase letter to an uppercase letter
    // If the char is not a lowercase letter,
    // it is returned unchanged.
    public static char toUpper(char ch) {
        if (ch < 'a' || ch > 'z') {
            return ch;
        }
        else {
            return (char) (ch -'a' + 'A');
        }
    }

    // The method is given a String as input and returns a
    // new String where all of the numbers have been removed
    // from the original String.
    public static String removeNumbers(String str) {
        String newStr  = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= '0' && c <= '9') {
                continue;
            }
            else {
                newStr += c;
            }
        }
        return newStr;
    }

    // Write some code to test your methods!
    public static void main(String[] args) {
        // ADD SOME TESTING CODE HERE
    }
}
