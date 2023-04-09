package MethodsLAB;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String textInput = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(repeatedString(n, textInput));
    }

    public static String repeatedString(int n, String text){
        String result = "";
        for (int i = 0; i < n; i++) {
            result = result + text;
        }

        return result;
    }
}
