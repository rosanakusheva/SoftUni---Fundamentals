package MethodsLAB;

import java.util.Scanner;

public class SignOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        printNumberSign(number);
    }

    public static void printNumberSign(int num) {
        String sign = "";
        if (num > 0) {
            sign = "positive";

        } else if (num < 0) {
            sign = "negative";

        } else {
            sign = "zero";

        }

        System.out.printf("The number %d is %s.", num, sign);
    }
}
