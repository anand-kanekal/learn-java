package programs.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatchesWithSplit {

    private static final String REGEX = "\\d";

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(REGEX, Pattern.CASE_INSENSITIVE);
        String[] matches = pattern.split("geeks1for2geeks3");

        for(String match : matches) {
            System.out.println(match);
        }
    }
}
