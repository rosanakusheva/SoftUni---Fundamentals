import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
    public static void main(String[] args) {

        Random randomNum = new Random();
        int pcNumber = randomNum.nextInt(100);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Guess a number from 1 to 100: ");
            String playerInput = scanner.nextLine();

            boolean isValid = true;

            for (int i = 0; i < playerInput.length(); i++) {
                if (playerInput.charAt(i) < 48 || playerInput.charAt(i) > 57) {
                    isValid = false;
                    break;
                }

            }
            if (isValid) {
                int playerNum = Integer.parseInt(playerInput);
                if (playerNum == pcNumber) {
                    System.out.println("You guessed it!");
                    break;
                } else if (playerNum > pcNumber) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Too low!");
                }
            } else {
                System.out.println("Invalid input!");
            }
        }
    }
}
