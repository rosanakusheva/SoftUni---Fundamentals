package MethodsEXERCISE;

import java.util.Scanner;

public class NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        
        printNxNMatrix(n);

    }

    public static void printNxNMatrix(int num) {
        for (int k = 1; k <= num; k++) {

            for (int i = 1; i <= num; i++) {
                System.out.print(num + " ");

            }
            System.out.println();

        }

    }
}

