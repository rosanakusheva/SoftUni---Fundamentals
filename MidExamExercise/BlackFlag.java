package MidExamExercise;

import java.util.Scanner;

public class BlackFlag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int plunderPerDay = Integer.parseInt(scanner.nextLine());
        double expectedPlunder = Double.parseDouble(scanner.nextLine());


        double sum = 0;
        for (int i = 1; i <= days; i++) {
            sum += plunderPerDay;

            if (i % 3 == 0){
                sum = sum + (plunderPerDay * 0.5);
            }

            if (i % 5 == 0){
                sum = sum * 0.7;
            }


        }

        if (sum >= expectedPlunder){
            System.out.printf("Ahoy! %.2f plunder gained.", sum);
        } else {
            double gatheredPercentage = (sum / expectedPlunder) * 100;
            System.out.printf("Collected only %.2f%% of the plunder.", gatheredPercentage);
        }

    }
}
