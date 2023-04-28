package MidExamExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> targets = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("End")) {
            int index = Integer.parseInt(command.split("\\s+")[1]);


            if (command.contains("Shoot")) {
                if (index >= 0 && index < targets.size()) {
                    int power = Integer.parseInt(command.split("\\s+")[2]);
                    int elementToShoot = targets.get(index);
                    targets.set(index, elementToShoot - power);

                    if (elementToShoot - power <= 0) {
                        targets.remove(index);

                    }
                }

            } else if (command.contains("Add")) {
                if (index >= 0 && index < targets.size()) {
                    int value = Integer.parseInt(command.split("\\s+")[2]);
                    targets.add(index, value);
                } else {
                    System.out.println("Invalid placement!");
                }

            } else if (command.contains("Strike")) {
                int radius = Integer.parseInt(command.split("\\s+")[2]);
                if (index >= 0 && index < targets.size()) {
                    if (index - radius >= 0 && index + radius < targets.size() ) {
                        List<Integer> partToBeRemoved = targets.subList(index - radius, index + radius+ 1);
                        targets.removeAll(partToBeRemoved);
                    } else {
                        System.out.println("Strike missed!");
                    }
                }

            }

            command = scanner.nextLine();
        }

        System.out.println(targets.toString().replace("[", "")
                .replace("]", "")
                .trim()
                .replace(",", "|")
                .replaceAll("\\s+", ""));

    }
}
