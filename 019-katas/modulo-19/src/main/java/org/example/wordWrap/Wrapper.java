package org.example.wordWrap;

public class Wrapper {
    public static String wrap(String sentence, int columns) {
        if (sentence.length() <= columns) {
            return sentence;
        }

        int lastSpaceIndex = sentence.substring(0, columns).lastIndexOf(' ');
        if (lastSpaceIndex == 0) {
            return wrap(sentence.substring(lastSpaceIndex+1), columns);
        } else if (lastSpaceIndex > 0) {
            return sentence.substring(0, lastSpaceIndex) + "\n" + wrap(sentence.substring(lastSpaceIndex+1), columns);
        }

        return sentence.substring(0, columns) + "\n" + wrap(sentence.substring(columns), columns);
    }
}
