import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rawActivationKey = scanner.nextLine();
        StringBuilder sb = new StringBuilder(rawActivationKey);

        String command = scanner.nextLine();
        while (!command.equals("Generate")) {

            if (command.contains("Contains")) {
                String substring = command.split(">>>")[1];

                if (rawActivationKey.contains(substring)) {
                    System.out.printf("%s contains %s%n", rawActivationKey, substring);
                } else {
                    System.out.println("Substring not found!");
                }


            } else if (command.contains("Flip")) {
                String typeOfCase = command.split(">>>")[1];
                int startIndex = Integer.parseInt(command.split(">>>")[2]);
                int endIndex = Integer.parseInt(command.split(">>>")[3]);

                if (typeOfCase.equals("Upper")) {
                    String substring = rawActivationKey.substring(startIndex, endIndex).toUpperCase();
                    rawActivationKey = new StringBuilder(rawActivationKey).replace(startIndex, endIndex, substring).toString();
                    System.out.println(rawActivationKey);

                } else if (typeOfCase.equals("Lower")) {
                    String substring = rawActivationKey.substring(startIndex, endIndex).toLowerCase();
                    rawActivationKey = new StringBuilder(rawActivationKey).replace(startIndex, endIndex, substring).toString();
                    System.out.println(rawActivationKey);
                }


            } else if (command.contains("Slice")) {

                int startIndex = Integer.parseInt(command.split(">>>")[1]);
                int endIndex = Integer.parseInt(command.split(">>>")[2]);
                String substring = rawActivationKey.substring(startIndex, endIndex);
                rawActivationKey = new StringBuilder(rawActivationKey).delete(startIndex, endIndex).toString();
                System.out.println(rawActivationKey);

            }

            command = scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s", rawActivationKey);

    }
}
