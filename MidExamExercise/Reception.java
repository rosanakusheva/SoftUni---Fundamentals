package MidExamExercise;

import java.util.Scanner;

public class Reception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstEmployeeCount = Integer.parseInt(scanner.nextLine());
        int secondEmployeeCount = Integer.parseInt(scanner.nextLine());
        int thirdEmployeeCount = Integer.parseInt(scanner.nextLine());
        int studentsNumber = Integer.parseInt(scanner.nextLine());
        int neededHours = 0;

        int totalAnswersPerHour = firstEmployeeCount + secondEmployeeCount + thirdEmployeeCount;

        while (studentsNumber > 0) {
            neededHours++;
            if (neededHours % 4 == 0) {
                continue;
            }
            studentsNumber -= totalAnswersPerHour;

        }

        System.out.printf("Time needed: %dh.", neededHours);
    }
}
