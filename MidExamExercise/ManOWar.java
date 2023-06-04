package MidExamExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ManOWar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> pirateShipStatus = Arrays.stream(scanner.nextLine().split(">"))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> warShipStatus = Arrays.stream(scanner.nextLine().split(">"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int maxHealth = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("Retire")) {
            String command = input.split("\\s+")[0];

            if (command.equals("Fire")) {
                int index = Integer.parseInt(input.split("\\s+")[1]);
                int damage = Integer.parseInt(input.split("\\s+")[2]);
                if (index >= 0 && index < warShipStatus.size()) {
                    int numToDamage = warShipStatus.get(index);
                    numToDamage -= damage;
                    warShipStatus.set(index, numToDamage);
                    if (numToDamage <= 0) {
                        System.out.println("You won! The enemy ship has sunken.");
                        break;
                    }
                }

            } else if (command.equals("Defend")) {
                int startIndex = Integer.parseInt(input.split("\\s+")[1]);
                int endIndex = Integer.parseInt(input.split("\\s+")[2]);
                int damage = Integer.parseInt(input.split("\\s+")[3]);

                if (startIndex >= 0 && startIndex < pirateShipStatus.size() && endIndex >= 0 && endIndex < pirateShipStatus.size()) {
                    for (int i = startIndex; i <= endIndex; i++) {
                        int numToDamage = pirateShipStatus.get(i);
                        numToDamage -= damage;

                        if (numToDamage <= 0) {
                            System.out.println("You lost! The pirate ship has sunken.");
                           break;
                        }
                        pirateShipStatus.set(i, numToDamage);

                    }
                }


            } else if (command.equals("Repair")) {
                int index = Integer.parseInt(input.split("\\s+")[1]);
                int health = Integer.parseInt(input.split("\\s+")[2]);

                if (index >= 0 && index < pirateShipStatus.size()) {
                    int numToBeHealed = pirateShipStatus.get(index);
                    numToBeHealed = numToBeHealed + health;

                    if (numToBeHealed + health > maxHealth) {
                        numToBeHealed = maxHealth;
                        pirateShipStatus.set(index, numToBeHealed);
                    }
                    pirateShipStatus.set(index, numToBeHealed);
                }


            } else if (command.equals("Status")) {
                int  count = 0;
                for (int i = 0; i <= pirateShipStatus.size() - 1 ; i++) {
                    int section = pirateShipStatus.get(i);
                    if (section < 0.2 * maxHealth){
                        count++;

                    }
                }
                System.out.printf("%d sections need repair.%n", count);
                count = 0;

            }

            input = scanner.nextLine();
        }
        int sum1 = 0;
        for (int num : pirateShipStatus){
            sum1 = sum1 + num;
        }

        int sum2 = 0;
        for ( int num : warShipStatus){
            sum2 = sum2 + num;
        }

        System.out.printf("Pirate ship status: %d%n", sum1);
        System.out.printf("Warship status: %d%n", sum2);

    }
}
