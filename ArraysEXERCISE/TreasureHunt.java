package ArraysEXERCISE;

import java.util.Scanner;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] loot = scanner.nextLine().split("\\|");

        String command =scanner.nextLine();
        while (!command.equals("Yohoho!")){
            String[] commandParts = command.split(" ");
            String commandName = commandParts[0];

            switch (commandName){
                case "Loot":
                    break;
                case "Drop":
                    int dropIndex = Integer.parseInt(commandParts[1]);
                    if (dropIndex < 0 || dropIndex >= loot.length){
                        break;
                    }else {
                        String currentLoot = loot[dropIndex];
                        for (int leftIndex = dropIndex; leftIndex < loot.length - 1; leftIndex++) {
                            loot[leftIndex] = loot[leftIndex + 1];
                        }
                        loot[loot.length - 1] = currentLoot;
                    }
                    break;
                case "Steal":
                    break;
            }




            command = scanner.nextLine();
        }

    }
}
