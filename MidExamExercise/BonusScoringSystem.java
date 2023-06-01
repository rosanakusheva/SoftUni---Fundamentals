package MidExamExercise;

import java.util.Scanner;

public class BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numStudents = Integer.parseInt(scanner.nextLine());
        int numLectures = Integer.parseInt(scanner.nextLine());
        int additionalBonus = Integer.parseInt(scanner.nextLine());
        double maxBonus = 0;
        int maxAttendance = 0;

        for (int i = 1; i <= numStudents ; i++) {
            int attendance = Integer.parseInt(scanner.nextLine());
            double totalBonus = (attendance * 1.0 / numLectures) * (5 + additionalBonus);
            if (totalBonus > maxBonus){
                maxBonus = totalBonus;
                maxAttendance = attendance;
            }

        }
        System.out.printf("Max Bonus: %.0f.%n", Math.ceil(maxBonus));
        System.out.printf("The student has attended %d lectures.", maxAttendance);


    }
}
