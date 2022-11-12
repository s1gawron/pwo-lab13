package pwo.lab13;

public class Text {

    static boolean cont5Dig(String str) {
        return str.replaceAll("[^0-9]", "").length() == 5;
    }

    static int countDigitsInText(String text) {
        int counter = 0;
        String noWhiteSpaceString = text.replaceAll("\\s+","");

        for (char c : noWhiteSpaceString.toCharArray()) {
            if (Character.isDigit(c)) {
                counter++;
            }
        }

        return counter;
    }

    static boolean hasDigits(String text) {
        boolean hasDigits = false;
        String noWhiteSpaceString = text.replaceAll("\\s+","");

        for (char c : noWhiteSpaceString.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigits = true;
            }
        }

        return hasDigits;
    }

    static boolean hasOnlyDigits(String text) {
        boolean hasOnlyDigits = true;
        String noWhiteSpaceString = text.replaceAll("\\s+","");

        for (char c : noWhiteSpaceString.toCharArray()) {
            if (!Character.isDigit(c)) {
                hasOnlyDigits = false;
            }
        }

        return hasOnlyDigits;
    }

}
