package MidExamExercise;

import java.util.Scanner;

public class GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double monthlyFood = Double.parseDouble(scanner.nextLine());
        double monthlyHay = Double.parseDouble(scanner.nextLine());
        double monthlyCover = Double.parseDouble(scanner.nextLine());
        double pigsWeight = Double.parseDouble(scanner.nextLine());

        double foodInGrams = monthlyFood * 1000;
        double hayInGrams = monthlyHay * 1000;
        double coverInGrams = monthlyCover * 1000;
        double weightInGrams = pigsWeight * 1000;


        for (int i = 1; i <= 30; i++) {
            foodInGrams -= 300;

            if (i % 2 == 0) {
                hayInGrams = hayInGrams - (foodInGrams * 0.05);
            }

            if (i % 3 == 0) {
                coverInGrams = coverInGrams - (weightInGrams * 1/3);
            }

        }
        double foodKg = foodInGrams / 1000;
        double hayKg = hayInGrams / 1000;
        double coverKg = coverInGrams / 1000;
        if (foodKg >= 0 && hayKg >= 0 && coverKg >= 0) {
//
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.", foodKg, hayKg,  coverKg);
        } else {
            System.out.println("Merry must go to the pet store!");
        }
    }
}
