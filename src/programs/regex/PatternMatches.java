package programs.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatches {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("geeks");
        Matcher match = pattern.matcher("geeksforgeeks");

        while (match.find()) {
            System.out.println("Pattern found from "
                    + match.start() + " to "
                    + (match.end() - 1));
        }
    }
}
