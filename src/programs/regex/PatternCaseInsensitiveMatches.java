package programs.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternCaseInsensitiveMatches {

    private static final String REGEX = "geeks";

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(REGEX, Pattern.CASE_INSENSITIVE);
        Matcher match = pattern.matcher("GEEKSforgeeks");

        while (match.find()) {
            System.out.println("Pattern found from "
                    + match.start() + " to "
                    + (match.end() - 1));
        }
    }
}

