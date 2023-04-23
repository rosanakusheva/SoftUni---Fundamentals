package MidExamExercise;

import java.util.Scanner;

public class CS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initialEnergy = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        int totalEnergy = initialEnergy;
        int countBattle = 0;
        boolean enoughEnergy = true;
        while (!input.equals("End of battle")) {
            int distance = Integer.parseInt(input);

            if (totalEnergy - distance < 0) {
                enoughEnergy = false;
                break;

            } else {
                totalEnergy -= distance;
                countBattle++;
                if (countBattle % 3 == 0) {
                    totalEnergy += countBattle;
                }
            }


            input = scanner.nextLine();
        }

        if (enoughEnergy) {
            System.out.printf("Won battles: %d. Energy left: %d%n", countBattle, totalEnergy);
        } else {
            System.out.printf("Not enough energy! Game ends with %d won battles and %d energy%n", countBattle, totalEnergy);

        }
    }
}
