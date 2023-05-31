package MidExamExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> rooms = Arrays.stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());
        int health = 100;


        int sumBitcoins = 0;
        boolean isDead = false;

        for (int i = 0; i <= rooms.size() - 1; i++) {
            String input = rooms.get(i);
            String command = input.split(" ")[0];
            int number = Integer.parseInt(input.split(" ")[1]);

            if (command.equals("potion")) {
                int healthBeforeHeal = health;
                health += number;

                if (health >= 100) {
                    health = 100;
                    System.out.printf("You healed for %d hp.%n", 100 - healthBeforeHeal);
                    System.out.printf("Current health: %d hp.%n", health);
                } else {
                    System.out.printf("You healed for %d hp.%n", number);
                    System.out.printf("Current health: %d hp.%n", health);

                }


            } else if (command.equals("chest")) {
                sumBitcoins += number;
                System.out.printf("You found %d bitcoins.%n", number);

            } else {
                health -= number;

                if (health > 0) {
                    System.out.printf("You slayed %s.%n", command);

                } else {
                    System.out.printf("You died! Killed by %s.%n", command);
                    System.out.printf("Best room: %d%n", i + 1);
                    isDead = true;
                    break;
                }

            }

        }
        if (!isDead) {
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n", sumBitcoins);
            System.out.printf("Health: %d%n", health);
        }

    }

}
