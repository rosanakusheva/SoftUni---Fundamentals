package FinalExamEXERCISE;

import java.util.Scanner;

public class TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String encryptedMessage = scanner.nextLine();
        StringBuilder modifyMessage = new StringBuilder(encryptedMessage);
        String input = scanner.nextLine();

        while (!input.equals("Decode")){
            if (input.contains("Move")){
                int countLetters = Integer.parseInt(input.split("\\|")[1]);
                String firstLetters = modifyMessage.substring(0,countLetters);
                modifyMessage.replace(0, countLetters, "");
                modifyMessage.append(firstLetters);

            } else if (input.contains("Insert")) {
                int index = Integer.parseInt(input.split("\\|")[1]);
                String text = input.split("\\|")[2];
                modifyMessage.insert(index, text);
                
            } else if (input.contains("ChangeAll")) {
                String textToReplace = input.split("\\|")[1];
                String replacement = input.split("\\|")[2];

                String currentMessage = modifyMessage.toString();
                currentMessage = currentMessage.replace(textToReplace, replacement);
                modifyMessage = new StringBuilder(currentMessage);

            }

            input = scanner.nextLine();
        }
        System.out.println("The decrypted message is: " + modifyMessage);
    }
}
