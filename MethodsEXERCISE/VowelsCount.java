package MethodsEXERCISE;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String textInput = scanner.nextLine();

        printCountOfVowels(textInput);
    }

    public static void printCountOfVowels(String text) {

        int vowelsCount = 0;
        for (char symbol : text.toLowerCase().toCharArray()) {

            if (symbol == 'a' || symbol == 'e' || symbol == 'o' || symbol == 'u' || symbol == 'i') {
                vowelsCount++;
            }
        }

        System.out.println(vowelsCount);
    }
}
