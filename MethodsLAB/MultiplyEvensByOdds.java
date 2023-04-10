package MethodsLAB;

import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        if (n < 0){
            n = n * (-1);
        }

        int result = getMultipleOfEvenAndOdds(n);

        System.out.println(result);

    }

    public static int getMultipleOfEvenAndOdds(int number) {
        int evenSum = getSumOfEvenDigits(number);
        int oddSum = getSumOfOddDigits(number);

        return evenSum * oddSum;
    }

    public static int getSumOfEvenDigits(int num) {
        int evenSum = 0;

        while (num != 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                evenSum += digit;
            }

            num /= 10;
        }

        return evenSum;
    }

    public static int getSumOfOddDigits(int num) {
        int oddSum = 0;

        while (num != 0){
            int digit = num % 10;

            if (digit % 2 == 1){
                oddSum += digit;
            }

            num /= 10;

        }

        return oddSum;
    }
}
