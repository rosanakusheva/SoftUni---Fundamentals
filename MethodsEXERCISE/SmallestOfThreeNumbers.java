package MethodsEXERCISE;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        System.out.println(getSmallestOfThreeNumbers(firstNum, secondNum, thirdNum));

    }

    public static int getSmallestOfThreeNumbers(int num1, int num2, int num3) {
        int smallestNum = Integer.MAX_VALUE;

        if (num1 < num2 && num1 < num3) {

            smallestNum = num1;

        } else if (num2 < num1 && num2 < num3) {

            smallestNum = num2;

        } else {

            smallestNum = num3;
        }

        return smallestNum;
    }
}
