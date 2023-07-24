import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> validLocations = new ArrayList<>();
        int totalLength = 0;

        String text = scanner.nextLine();
        String regex = "(=|\\/)(?<destination>[A-Z][A-Za-z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String destination = matcher.group("destination");
            int lengthLocation = destination.length();
            totalLength += lengthLocation;
            validLocations.add(destination);
        }

        System.out.print("Destinations: ");
        System.out.print(String.join(", ", validLocations));
        System.out.println();
        System.out.printf("Travel Points: %d", totalLength);


    }
}
