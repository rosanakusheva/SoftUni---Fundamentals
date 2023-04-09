package MethodsLAB;

import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int widthInput = Integer.parseInt(scanner.nextLine());
        int lengthInput = Integer.parseInt(scanner.nextLine());

        int area = getRectangleArea(widthInput, lengthInput);

        System.out.println(area);
    }

    public static int getRectangleArea(int width, int length){
        return width * length;
    }
}
