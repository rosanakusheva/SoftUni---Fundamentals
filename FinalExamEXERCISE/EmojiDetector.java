package FinalExamEXERCISE;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        long coolThreshold = 1;

        for (char symbol : input.toCharArray()) {
            if (Character.isDigit(symbol)) {
                int number = Integer.parseInt(symbol + "");
                coolThreshold = coolThreshold * number;
            }
        }
        System.out.printf("Cool threshold: %d%n", coolThreshold);

        String regex = "([:]{2}|[*]{2})(?<emoji>[A-Z][a-z]{2,})(\\1)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        List<String> coolEmojis = new ArrayList<>();
        int countValidEmojis = 0;
        while (matcher.find()) {
            countValidEmojis++;

            int coolLevelCurrentEmoji = 0;
            String emoji = matcher.group("emoji");

            for (char symbol : emoji.toCharArray()) {
                coolLevelCurrentEmoji += (int) symbol;

            }
            if (coolLevelCurrentEmoji >= coolThreshold){
                coolEmojis.add(matcher.group());
            }
        }
        System.out.printf("%d emojis found in the text. The cool ones are:%n", countValidEmojis);
        coolEmojis.forEach(System.out::println);

    }
}
