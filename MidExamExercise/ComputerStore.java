package MidExamExercise;

import java.util.Scanner;

public class ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double sumWithoutTax = 0;
        double sumTaxes = 0;
        double sum = 0;

        while (!input.equals("special") && !input.equals("regular")) {
            double partPrice = Double.parseDouble(input);

            if (partPrice < 0) {
                System.out.println("Invalid price!");
                input = scanner.nextLine();
                continue;
            }
            sumWithoutTax += partPrice;
            sumTaxes += partPrice * 0.20;
            double priceWithTax = partPrice + (partPrice * 0.20);
            sum += priceWithTax;

            input = scanner.nextLine();

        }
        if (input.equals("special")) {
            sum = sum * 0.90;

        }

        if (sum == 0) {
            System.out.println("Invalid order!");

        } else {
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", sumWithoutTax);
            System.out.printf("Taxes: %.2f$%n", sumTaxes);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$%n", sum);
        }

    }
}
