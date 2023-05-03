package MidExamExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> groceriesList = Arrays.stream(scanner.nextLine().split("!"))
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("Go Shopping!")) {

            if (command.contains("Urgent")) {
                String itemToAdd = command.split("\\s+")[1];
                if (!groceriesList.contains(itemToAdd)) {
                    groceriesList.add(0, itemToAdd);
                }


            } else if (command.contains("Unnecessary")) {
                String itemToRemove = command.split("\\s+")[1];

                if (groceriesList.contains(itemToRemove)) {
                    groceriesList.remove(itemToRemove);

                }

            } else if (command.contains("Correct")) {
                String oldItem = command.split("\\s+")[1];
                String newItem = command.split("\\s+")[2];
                int index = groceriesList.indexOf(oldItem);

                if (groceriesList.contains(oldItem)) {
                    groceriesList.set(index, newItem);

                }

            } else if (command.contains("Rearrange")) {
                String item = command.split("\\s+")[1];

                if (groceriesList.contains(item)) {
                    int index = groceriesList.indexOf(item);
                    groceriesList.remove(item);
                    groceriesList.add(item);
                }

            }

            command = scanner.nextLine();
        }
        System.out.println(String.join(", ", groceriesList));


    }

}

