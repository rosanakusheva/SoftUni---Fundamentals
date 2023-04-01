package ArraysEXERCISE;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int [] firstArray = new int[number];
        int [] secondArray = new int[number];

        for (int row = 1; row <= number ; row++) {
            String numbers = scanner.nextLine();
            int firstNum = Integer.parseInt(numbers.split(" ")[0]);
            int secondNum = Integer.parseInt(numbers.split(" ")[1]);

            if (row % 2 == 0){
                firstArray[row - 1] = secondNum;
                secondArray[row - 1] = firstNum;
            }else {
                firstArray[row -1] = firstNum;
                secondArray[row - 1] = secondNum;
            }

        }
        for (int num : firstArray){
            System.out.print(num + " ");
        }

        System.out.println();

        for (int num2 : secondArray){
            System.out.print(num2 + " ");
        }
    }
}
