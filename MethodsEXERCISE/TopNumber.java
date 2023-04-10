package MethodsEXERCISE;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int number = 1; number <= n; number++) {
            if (isSumOfDigitsDivisibleBy8(number) && numContainsOneOddDigit(number)) {
                System.out.println(number);
            }

        }
    }

    public static boolean isSumOfDigitsDivisibleBy8(int num) {

        int sum = 0;
        while (num > 0) {

            int digit = num % 10;
            sum += digit;
            num = num / 10;
        }
        return sum % 8 == 0;
    }

    public static boolean numContainsOneOddDigit(int number) {

        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 != 0) {
                return true;
            } else {
                number = number / 10;
            }
        }
        return false;
    }
}
