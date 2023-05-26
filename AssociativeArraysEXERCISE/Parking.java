package AssociativeArraysEXERCISE;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Parking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String> registeredUser = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String command = scanner.nextLine();
            String username = command.split("\\s+")[1];


            if (command.startsWith("register")) {

                String licensePlateNumber = command.split("\\s+")[2];
                if (!registeredUser.containsKey(username)) {
                    registeredUser.put(username, licensePlateNumber);
                    System.out.printf("%s registered %s successfully%n", username, licensePlateNumber);
                } else {
                    System.out.printf("ERROR: already registered with plate number %s%n", licensePlateNumber);
                }

            } else if (command.startsWith("unregister")) {

                if (!registeredUser.containsKey(username)){
                    System.out.printf("ERROR: user %s not found%n", username);

                } else {
                    registeredUser.remove(username);
                    System.out.printf("%s unregistered successfully%n", username);
                }

            }

        }
        registeredUser.entrySet().forEach(entry -> System.out.println(entry.getKey() + " => " + entry.getValue()));
    }
}
