package MethodsLAB;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String commandInput = scanner.nextLine();
        int firstNumInput = Integer.parseInt(scanner.nextLine());
        int secondNumInput = Integer.parseInt(scanner.nextLine());

        if (commandInput.equals("add")) {
            printAddedNumbers(firstNumInput, secondNumInput);

        } else if (commandInput.equals("multiply")) {
            printMultipliedNumbers(firstNumInput, secondNumInput);

        } else if (commandInput.equals("subtract")) {
            printSubtractedNumbers(firstNumInput, secondNumInput);

        } else if (commandInput.equals("divide")) {
            printDividedNumbers(firstNumInput, secondNumInput);

        }
    }

    public static void printAddedNumbers(int firstNum, int secondNum) {
        System.out.println(firstNum + secondNum);
    }

    public static void printMultipliedNumbers(int firstNum, int secondNum) {
        System.out.println(firstNum * secondNum);
    }

    public static void printSubtractedNumbers(int firstNum, int secondNum) {
        System.out.println(firstNum - secondNum);
    }

    public static void printDividedNumbers(int firstNum, int secondNum) {
        System.out.println(firstNum / secondNum);
    }
}
