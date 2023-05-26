package AssociativeArraysEXERCISE;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> resourceQuantity = new LinkedHashMap<>();
        String resource = scanner.nextLine();

        while (!resource.equals("stop")) {
            int quantity = Integer.parseInt(scanner.nextLine());

            if (!resourceQuantity.containsKey(resource)) {
                resourceQuantity.put(resource, quantity);

            } else {
                int currentQuantity = resourceQuantity.get(resource);
                resourceQuantity.put(resource, currentQuantity + quantity);
            }

            resource = scanner.nextLine();
        }
        resourceQuantity.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
