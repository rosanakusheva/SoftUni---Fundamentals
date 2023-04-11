package MethodsEXERCISE;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        if (!isValidLength(password)) {
            System.out.println("Password must be between 6 and 10 characters");
        }

        if (!isValidContent(password)) {
            System.out.println("Password must consist only of letters and digits");
        }

        if (!isValidCountDigits(password)){
            System.out.println("Password must have at least 2 digits");
        }

        if (isValidCountDigits(password) && isValidContent(password) && isValidLength(password)){
            System.out.println("Password is valid");
        }


    }

    public static boolean isValidLength(String pass) {


        return pass.length() >= 6 && pass.length() <= 10;

    }

    public static boolean isValidContent(String password) {

        for (char symbol : password.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isValidCountDigits(String password) {
        int countDigits = 0;

        for (char symbol : password.toCharArray()) {
            if (Character.isDigit(symbol)) {
                countDigits++;

            }
        }
        return countDigits >= 2;

    }
}
