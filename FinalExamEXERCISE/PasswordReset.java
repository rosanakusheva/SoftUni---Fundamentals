import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        StringBuilder concatSymbols = new StringBuilder();

        String[] command = scanner.nextLine().split(" ");
        while (!command[0].equals("Done")) {

            if (command[0].equals("TakeOdd")) {
                for (int i = 1; i <= text.length() - 1; i++) {
                    if (i % 2 != 0) {
                        char symbol = text.charAt(i);
                        concatSymbols.append(symbol);
                    }
                }
                text = concatSymbols.toString();
                System.out.println(text);

            } else if (command[0].equals("Cut")) {
                int startIndex = Integer.parseInt(command[1]);
                int length = Integer.parseInt(command[2]);
                int endIndex = startIndex + length;
                text = new StringBuilder(text)
                        .delete(startIndex, endIndex).toString();

                System.out.println(text);


            } else if (command[0].equals("Substitute")) {
                String substring = command[1];
                String substitute = command[2];
                if (text.contains(substring)) {
                    text = text.replace(substring, substitute);
                    System.out.println(text);

                } else {
                    System.out.println("Nothing to replace!");
                }

            }
            command  = scanner.nextLine().split(" ");
        }
        System.out.println("Your password is: " + text);
    }
}
