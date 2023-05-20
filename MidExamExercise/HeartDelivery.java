package MidExamExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> house = Arrays.stream(scanner.nextLine().split("@"))
                .map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();

        int currentIndex = 0;
        int successMission = 0;

        while (!input.contains("Love!")) {

            int length = Integer.parseInt(input.split("\\s+")[1]);

            currentIndex += length;
            if (currentIndex >= house.size()) {
                currentIndex = 0;
            }

            int houseToDecrease = house.get(currentIndex);
            if (houseToDecrease != 0) {
                houseToDecrease -= 2;
                house.set(currentIndex, houseToDecrease);
                if (houseToDecrease == 0) {
                    successMission++;
                    System.out.printf("Place %d has Valentine's day.%n", currentIndex);
                }
            } else {
                System.out.printf("Place %d already had Valentine's day.%n", currentIndex);
            }


            input = scanner.nextLine();

        }
        System.out.printf("Cupid's last position was %d.%n", currentIndex);
       // int countFails = 0;
//        for (int element : house) {
//            if (element != 0) {
//                countFails++;
//            }
//        }
        if (successMission == house.size()) {
            System.out.println("Mission was successful.");
        } else {
            System.out.printf("Cupid has failed %d places.", house.size() - successMission);
        }

    }
}
