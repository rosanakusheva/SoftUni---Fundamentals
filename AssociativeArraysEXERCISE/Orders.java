package AssociativeArraysEXERCISE;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();

        Map<String, Integer> productsQuantity = new LinkedHashMap<>();
        Map<String, Double> productsPrice = new LinkedHashMap<>();

        while (!data.equals("buy")) {
            String product = data.split(" ")[0];
            double price = Double.parseDouble(data.split(" ")[1]);
            int quantity = Integer.parseInt(data.split(" ")[2]);

            if (!productsQuantity.containsKey(product)) {
                productsQuantity.put(product, quantity);
            } else {
                int currentQuantity = productsQuantity.get(product);
                productsQuantity.put(product, currentQuantity + quantity);
            }

            productsPrice.put(product, price);

            data = scanner.nextLine();

        }
        for (Map.Entry<String, Integer> entry : productsQuantity.entrySet()) {
            String productName = entry.getKey();
            double finalSum = productsQuantity.get(productName) * productsPrice.get(productName);
            System.out.printf("%s -> %.2f%n", productName, finalSum);
        }

    }
}
