package MethodsEXERCISE;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        long factorial1 = calculateFactorial(firstNum);
        long factorial2 = calculateFactorial(secondNum);

        double result = factorial1 * 1.0 / factorial2;
        System.out.printf("%.2f", result);

    }

    public static long calculateFactorial(int number){

        long factorial = 1;
        for (int i = 1; i <= number ; i++) {
            factorial = factorial * i;
        }

        return factorial;
    }
}
