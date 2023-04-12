package MethodsEXERCISE;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        int result = addingTwoNumbers(firstNum,secondNum);
        System.out.println(result - thirdNum);
    }

    public static int addingTwoNumbers(int num1, int num2){
        return num1 + num2;
    }
}
