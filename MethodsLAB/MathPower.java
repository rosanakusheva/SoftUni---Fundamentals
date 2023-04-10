package MethodsLAB;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numberInput = Double.parseDouble(scanner.nextLine());
        int powerInput = Integer.parseInt(scanner.nextLine());

        DecimalFormat df = new DecimalFormat("0.####");

        double result = mathPower(numberInput, powerInput);

        System.out.println(df.format(result));

    }

    public static double mathPower(double number, int power) {
        double result = 0;

        result = Math.pow(number, power);

        return result;
    }
}
