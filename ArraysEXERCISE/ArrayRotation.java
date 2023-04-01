package ArraysEXERCISE;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(" ");
        int countRotations = Integer.parseInt(scanner.nextLine());

        for (int rotation = 0; rotation < countRotations; rotation++) {
            String firstElement = arr[0];

            for (int index = 0; index < arr.length - 1; index++) {
                arr[index] = arr[index + 1];

            }
            arr[arr.length - 1] = firstElement;
        }
        for (String element : arr){
            System.out.print(element + " ");
        }

    }
}
