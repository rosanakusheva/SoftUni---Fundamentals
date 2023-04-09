package MethodsLAB;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String productInput = scanner.nextLine();
        int quantityInput = Integer.parseInt(scanner.nextLine());

        printTotalSum(productInput, quantityInput);
    }

    public static double getProductPrice(String product) {
        double price = 0;

        if (product.equals("coffee")) {
            price = 1.50;

        } else if (product.equals("water")) {
            price = 1;

        } else if (product.equals("coke")) {
            price = 1.40;

        } else if (product.equals("snacks")) {
            price = 2.00;
        }

        return price;

    }

    public static double getTotalSum(String product, int quantity) {
        double price = getProductPrice(product);
        return price * quantity;
    }

    public static void printTotalSum(String product, int quantity){
        double totalSum = getTotalSum(product, quantity);
        System.out.printf("%.2f", totalSum);
    }

}
