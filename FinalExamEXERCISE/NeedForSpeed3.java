package FinalExamEXERCISE;

import java.util.*;
import java.util.stream.Collectors;

public class NeedForSpeed3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCars = Integer.parseInt(scanner.nextLine());

        Map<String, List<Integer>> carsMaps = new LinkedHashMap<>();

        for (int i = 1; i <= numCars; i++) {
            String carData = scanner.nextLine();
            String carModel = carData.split("\\|")[0];
            int mileage = Integer.parseInt(carData.split("\\|")[1]);
            int fuel = Integer.parseInt(carData.split("\\|")[2]);

            carsMaps.putIfAbsent(carModel, new ArrayList<>());
            carsMaps.get(carModel).add(0, mileage);
            carsMaps.get(carModel).add(1, fuel);

        }
        String input = scanner.nextLine();
        while (!input.equals("Stop")) {
            
            if (input.contains("Drive")){
                String car = input.split(" : ")[1];
                int distance = Integer.parseInt(input.split(" : ")[2]);
                int consumedFuel = Integer.parseInt(input.split(" : ")[3]);

                int currentFuel = carsMaps.get(car).get(1);
                int currentKm = carsMaps.get(car).get(0);
                if (currentFuel >= consumedFuel){
                    carsMaps.get(car).set(1, currentFuel - consumedFuel);
                    carsMaps.get(car).set(0, currentKm + distance);
                    System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", car, distance, consumedFuel);
                } else {
                    System.out.println("Not enough fuel to make that ride");
                }

                if (carsMaps.get(car).get(0) >= 100000){
                    System.out.println("Time to sell the " + car + "!");
                    carsMaps.remove(car);
                }

                
            } else if (input.contains("Refuel")) {
                String carToRefill = input.split(" : ")[1];
                int fuelToRefill = Integer.parseInt(input.split(" : ")[2]);

                int currentFuel = carsMaps.get(carToRefill).get(1);
                if (currentFuel + fuelToRefill > 75){
                    carsMaps.get(carToRefill).set(1, 75);
                    System.out.printf("%s refueled with %d liters%n", carToRefill, 75 - currentFuel);

                } else {
                    carsMaps.get(carToRefill).set(1, currentFuel + fuelToRefill);
                    System.out.printf("%s refueled with %d liters%n", carToRefill, fuelToRefill);
                }
                
            } else if (input.contains("Revert")) {
                String carToRevert = input.split(" : ")[1];
                int kmToRevert = Integer.parseInt(input.split(" : ")[2]);

                int currentKm = carsMaps.get(carToRevert).get(0);
                int kmAfterRevert = currentKm - kmToRevert;

                if (kmAfterRevert < 10000){
                    kmAfterRevert = 10000;

                } else {
                    System.out.printf("%s mileage decreased by %d kilometers%n", carToRevert,kmToRevert);
                }
                carsMaps.get(carToRevert).set(0, kmAfterRevert);

            }


            input = scanner.nextLine();
        }
        carsMaps.entrySet().forEach(entry -> {
            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n",entry.getKey(), entry.getValue().get(0),entry.getValue().get(1));
        } );
    }
}
