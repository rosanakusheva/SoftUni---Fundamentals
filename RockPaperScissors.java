import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    private static final String ROCK = "Rock";
    private static final String PAPER = "Paper";
    private static final String SCISSORS = "Scissors";
    public static void main(String[] args) {

        System.out.print("Choose [r]ock, [p]aper or [s]cissors: ");
        Scanner scanner = new Scanner(System.in);
        String playerMove = scanner.nextLine();
        if (playerMove.equals("r") || playerMove.equals("Rock") || playerMove.equals("rock")){
            playerMove = ROCK;
        } else if (playerMove.equals("p") || playerMove.equals("Paper") || playerMove.equals("paper")) {
            playerMove = PAPER;
        }else if (playerMove.equals("s") || playerMove.equals("Scissors") || playerMove.equals("scissors")){
            playerMove = SCISSORS;
        }else {
            System.out.println("Invalid input. Try again...");
            return;
        }
        Random random = new Random();
        int pcRandomNum = random.nextInt(4);
        String pcMove = "";
        if (pcRandomNum == 1){
            pcMove = ROCK;
        }else if (pcRandomNum == 2){
            pcMove = PAPER;
        } else if (pcRandomNum == 3) {
            pcMove = SCISSORS;
        }

        System.out.printf("The computer chose %s%n", pcMove);

        if (playerMove.equals(ROCK) && pcMove.equals(SCISSORS)
                || playerMove.equals(PAPER) && pcMove.equals(ROCK)
                || playerMove.equals(SCISSORS) && pcMove.equals(PAPER)){
            System.out.println("You win.");
        } else if (playerMove.equals(ROCK) && pcMove.equals(PAPER)
                || playerMove.equals(PAPER) && pcMove.equals(SCISSORS)
                || playerMove.equals(SCISSORS) && pcMove.equals(ROCK)) {
            System.out.println("You lose.");
        } else {
            System.out.println("This game was a draw.");
        }
    }




}