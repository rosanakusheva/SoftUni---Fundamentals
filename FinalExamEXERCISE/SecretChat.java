import java.util.Scanner;
import java.util.regex.Pattern;

public class SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] task = scanner.nextLine().split(":\\|:");

        while (!task[0].equals("Reveal")) {

            switch (task[0]) {
                case ("ChangeAll"):
                    input = input.replace(task[1], task[2]);
                    System.out.println(input);
                    break;
                case ("InsertSpace"):
                    int spaceNum = Integer.parseInt(task[1]);
                    input = input.substring(0, spaceNum) + " " + input.substring(spaceNum, input.length());
                    System.out.println(input);
                    break;
                case ("Reverse"):
                    String forCheck = task[1];
                    if (input.contains(forCheck)) {
                        String forReplays = new StringBuilder(forCheck).reverse().toString();
                        input = input.replaceFirst(Pattern.quote(forCheck), "") + forReplays;
                        System.out.println(input);
                    } else {
                        System.out.println("error");
                    }
                    break;
            }
            task = scanner.nextLine().split(":\\|:");
        }
        System.out.printf("You have a new text message: %s", input);

    }
}
