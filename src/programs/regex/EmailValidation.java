package programs.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailValidation {

    private static final String REGEX_EXP = "^([a-zA-Z0-9\\.-]+)@([a-zA-Z0-9]+)\\.([a-zA-Z]{2,3})$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter email ID: ");
        String input = scanner.nextLine();
        isValidEmail(input);
    }

    public static void isValidEmail(String email) {
        Pattern pattern = Pattern.compile(REGEX_EXP);

        if(pattern.matcher(email).matches()) {
            System.out.println("The entered " + email + " is valid");
        } else {
            System.out.println("The entered " + email + " is invalid");
        }
    }
}
