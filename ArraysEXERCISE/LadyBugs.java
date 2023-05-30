package ArraysEXERCISE;

import java.util.Arrays;
import java.util.Scanner;

public class LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fieldSize = Integer.parseInt(scanner.nextLine());
        int[] field = new int[fieldSize];

        int[] ladyBugsIndexes = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int ladyBugIndex : ladyBugsIndexes) {
            if (ladyBugIndex >= 0 && ladyBugIndex <= field.length - 1) {
                field[ladyBugIndex] = 1;
            }
        }

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] tokens = command.split(" ");
            int currentIndex = Integer.parseInt(tokens[0]);
            String direction = tokens[1];
            int flyLength = Integer.parseInt(tokens[2]);

            if (currentIndex >= 0 && currentIndex <= field.length - 1 && field[currentIndex] == 1) {
                field[currentIndex] = 0;
                if (direction.equals("right")) {
                    currentIndex += flyLength;
                    while (currentIndex <= field.length - 1 && field[currentIndex] == 1) {
                        currentIndex += flyLength;
                    }
                    if (currentIndex <= field.length - 1) {
                        field[currentIndex] = 1;
                    }

                } else if (direction.equals("left")) {
                    currentIndex -= flyLength;
                    while (currentIndex >= 0 && field[currentIndex] == 1) {
                        field[currentIndex] -= flyLength;
                    }
                    if (currentIndex >= 0) {
                        field[currentIndex] = 1;
                    }
                }
            }


            command = scanner.nextLine();
        }
        for (int number : field) {
            System.out.print(number + " ");
        }
    }
}
