package MidExamExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        List<Integer> wagons = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        for (int wagon = 0; wagon <= wagons.size() - 1; wagon++) {
            if (people > 0) {
                int currentCountPeopleInWagon = wagons.get(wagon);
                while (currentCountPeopleInWagon < 4) {

                    if (people <= 0) {
                        break;
                    }

                    currentCountPeopleInWagon++;
                    wagons.set(wagon, currentCountPeopleInWagon);
                    people--;
                }
            }

        }
        if (people <= 0 && wagons.get(wagons.size() - 1) < 4) {
            System.out.println("The lift has empty spots!");
        } else if (people > 0 && wagons.get(wagons.size() - 1) >= 4) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", people);

        }

        for (int element : wagons) {
            System.out.print(element + " ");
        }

//
//
//        int peopleWait = Integer.parseInt(scanner.nextLine()); //15
//        int [] wagons = Arrays.stream(scanner.nextLine().split("\\s+"))
//                .mapToInt(Integer::parseInt).toArray();
//        //[0, 0, 0 , 0]
//
//
//        for (int wagon = 0; wagon <= wagons.length - 1; wagon++) {
//            if (peopleWait > 0) {
//                int currentCountPeople = wagons[wagon]; //текущ брой на хората
//                while (currentCountPeople < 4) {
//                    //добавям човек във вагона ако има чакащи
//                    if (peopleWait <= 0) {
//                        break;
//                    }
//                    currentCountPeople++;
//                    wagons[wagon] = currentCountPeople;
//                    peopleWait--;
//                }
//            }
//        }
//
//        if (peopleWait <= 0 && wagons[wagons.length - 1] < 4) {
//            //имаме останало място
//            System.out.println("The lift has empty spots!");
//        } else if (peopleWait > 0 && wagons[wagons.length - 1] >= 4) {
//            //нямаме повече място
//            System.out.printf("There isn't enough space! %d people in a queue!%n", peopleWait);
//        }
//
//
//
//        //отпечатваме вагоните
//        for (int wagon : wagons) {
//            System.out.print(wagon + " ");
////        }
////    }
    }
}
