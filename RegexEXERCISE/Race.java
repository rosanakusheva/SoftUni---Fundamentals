package RegexEXERCISE;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> names = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());
        Map<String, Integer> racersDistances = new LinkedHashMap<>();

        names.forEach(racer -> racersDistances.put(racer, 0));

        String input = scanner.nextLine();

        String lettersRegex = "[A-Za-z]";
        Pattern patternLetter = Pattern.compile(lettersRegex);

        String digitsRegex = "[0-9]";
        Pattern patternDigit = Pattern.compile(digitsRegex);


        while (!input.equals("end of race")) {
            StringBuilder nameBuilder = new StringBuilder();
            Matcher letterMatcher = patternLetter.matcher(input);
            while (letterMatcher.find()) {
                nameBuilder.append(letterMatcher.group());
            }

            int distance = 0;
            Matcher digitsMatcher = patternDigit.matcher(input);
            while (digitsMatcher.find()) {
                distance += Integer.parseInt(digitsMatcher.group());
            }

            String racerName = nameBuilder.toString();
            if (names.contains(racerName)) {
                int currentDistance = racersDistances.get(racerName);
                racersDistances.put(racerName, currentDistance + distance);
            }

            input = scanner.nextLine();
        }
        for (int i = 0; i <= 2; i++) {
            if (i == 0){
                System.out.println("1st place: " + names.get(i));
            } else if (i == 1){
                System.out.println("2nd place: " + names.get(i));
            } else if (i == 2){
                System.out.println("3rd place: " + names.get(i));
            }

        }
    }
}
