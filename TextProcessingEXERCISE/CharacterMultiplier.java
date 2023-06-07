package TextProcessingEXERCISE;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] names = input.split("\\s+");

        String firstText = names[0];
        String secondText = names[1];

        int minLength = Math.min(firstText.length(), secondText.length());
        int maxLength = Math.max(firstText.length(), secondText.length());

        int sum = 0;
        for (int i = 0; i < minLength; i++) {
            sum += firstText.charAt(i) * secondText.charAt(i);

        }

        if (maxLength == firstText.length()) {
            for (int i = minLength; i < firstText.length(); i++) {
                sum += firstText.charAt(i);
            }
        } else {
            for (int i = minLength; i < secondText.length(); i++) {
                sum += secondText.charAt(i);
            }
        }

        System.out.println(sum);

    }
}
