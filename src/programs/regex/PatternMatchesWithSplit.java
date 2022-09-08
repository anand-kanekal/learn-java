package programs.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatchesWithSplit {

    public static void main(String[] args) {
        String delimiter = "\\d";
        Pattern pattern = Pattern.compile(delimiter, Pattern.CASE_INSENSITIVE);
        String[] matches = pattern.split("geeks1for2geeks3");

        for(String match : matches) {
            System.out.println(match);
        }
    }
}
