package FinalExamEXERCISE;

import java.util.Scanner;
import java.util.regex.Pattern;

public class SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String hiddenMessage = scanner.nextLine();

        String[] command = scanner.nextLine().split(":\\|:");

        while (!command[0].equals("Reveal")) {

            switch (command[0]) {
                case ("ChangeAll"):
                    hiddenMessage = hiddenMessage.replace(command[1], command[2]);
                    System.out.println(hiddenMessage);
                    break;
                case ("InsertSpace"):
                    int spaceNum = Integer.parseInt(command[1]);
                    hiddenMessage = hiddenMessage.substring(0, spaceNum) + " " + hiddenMessage.substring(spaceNum, hiddenMessage.length());
                    System.out.println(hiddenMessage);
                    break;
                case ("Reverse"):
                    String forCheck = command[1];
                    if (hiddenMessage.contains(forCheck)) {
                        String reversed = new StringBuilder(forCheck).reverse().toString();
                        hiddenMessage = hiddenMessage.replaceFirst(Pattern.quote(forCheck), "") + reversed;
                        System.out.println(hiddenMessage);
                    } else {
                        System.out.println("error");
                    }
                    break;
            }
            command = scanner.nextLine().split(":\\|:");
        }
        System.out.printf("You have a new text message: %s", hiddenMessage);

    }
}
