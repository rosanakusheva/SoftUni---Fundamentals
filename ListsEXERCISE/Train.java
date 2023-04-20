package ListsEXERCISE;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        while (!input.equals("end")) {

            if (input.contains("Add")) {
                int addedWagonWithPeople = Integer.parseInt(input.split(" ")[1]);
                wagons.add(addedWagonWithPeople);

            } else {
                int passengers = Integer.parseInt(input.split(" ")[0]);

                for (int i = 0; i <= wagons.size() - 1; i++) {
                    int currentNumOfPeople = wagons.get(i);

                    if (currentNumOfPeople + passengers <= maxCapacity) {
                        wagons.add(i, currentNumOfPeople + passengers);
                        wagons.remove(i + 1);
                        break;
                    }

                }

            }
            input = scanner.nextLine();
        }
        for (int num : wagons) {
            System.out.print(num + " ");
        }
    }
}
