package MethodsLAB;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int secondNum = Integer.parseInt(scanner.nextLine());

        DecimalFormat df = new DecimalFormat("0.##");

        double result = calculation(firstNum, operator,secondNum);

        System.out.println(df.format(result));

    }

    public static double calculation(int firstNumber, String operator, int secondNumber){
        double result = 0;

        if (operator.equals("+")){
            result = firstNumber + secondNumber;

        }else if (operator.equals("-")){
            result = firstNumber - secondNumber;

        }else if (operator.equals("*")){
            result = firstNumber * secondNumber;

        } else if (operator.equals("/")) {
            result = firstNumber * 1.0 / secondNumber;

        }

        return result;
    }
}
