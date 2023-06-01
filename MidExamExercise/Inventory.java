package MidExamExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> items = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("Craft!")) {
            String command = input.split(" - ")[0];
            String item = input.split(" - ")[1];

            if (command.contains("Collect")) {

                if (!items.contains(item)) {
                    items.add(item);
                }

            } else if (command.contains("Drop")) {

                if (items.contains(item)) {
                    items.remove(item);
                }

            } else if (command.contains("Combine")) {
                String oldItem = item.split(":")[0];
                String newItem = item.split(":")[1];
                for (int i = 0; i <= items.size() - 1; i++) {
                    if (items.get(i).equals(oldItem)) {
                        items.add(i + 1, newItem);
                        break;
                    }
                }

            } else if (command.contains("Renew")) {
                if (items.contains(item)){
                   int index = items.indexOf(item);
                   items.remove(item);
                   items.add(item);
                }
            }

            input = scanner.nextLine();
        }
        System.out.println(String.join(", ", items));
    }
}
