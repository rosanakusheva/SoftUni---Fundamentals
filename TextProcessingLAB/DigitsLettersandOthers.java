package TextProcessingLAB;

import java.util.Scanner;

public class DigitsLettersandOthers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        StringBuilder digitsSb = new StringBuilder();
        StringBuilder lettersSb = new StringBuilder();
        StringBuilder othersSb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);

            if (Character.isDigit(symbol)){
               digitsSb.append(symbol);

            } else if (Character.isLetter(symbol)) {
                  lettersSb.append(symbol);

            } else {
                othersSb.append(symbol);

            }
        }
        System.out.println(digitsSb);
        System.out.println(lettersSb);
        System.out.println(othersSb);
    }
}
