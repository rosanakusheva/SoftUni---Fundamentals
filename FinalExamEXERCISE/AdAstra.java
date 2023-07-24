import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String regex = "(?<symbols>[#\\|])(?<name>[A-za-z\\s]+)(\\1)(?<date>[0-9]{2}[\\/][0-9]{2}[\\/][0-9]{2})(\\1)(?<calories>[\\d]{1,5})(\\1)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int sumCalories = 0;

        List<String> items = new LinkedList<>();

        while (matcher.find()) {
            String itemName = matcher.group("name");
            String date = matcher.group("date");
            int calories = Integer.parseInt(matcher.group("calories"));

            sumCalories += calories;
            items.add(String.format("Item: %s, Best before: %s, Nutrition: %d%n", itemName, date, calories));
        }
        int days = sumCalories / 2000;
        System.out.printf("You have food to last you for: %d days!%n", days);

        for (String item : items) {
            System.out.print(item);
        }

    }
}
