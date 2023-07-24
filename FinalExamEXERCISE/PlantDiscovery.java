import java.util.*;

public class PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> rarityMap = new LinkedHashMap<>();
        Map<String, List<Double>> ratingMap = new LinkedHashMap<>();

        for (int i = 1; i <= num; i++) {
            String plantInfo = scanner.nextLine();
            String plantName = plantInfo.split("<->")[0];
            int plantRarity = Integer.parseInt(plantInfo.split("<->")[1]);


            if (rarityMap.containsKey(plantName)) {
                rarityMap.replace(plantName, plantRarity);
            } else {
                rarityMap.put(plantName, plantRarity);
            }
            ratingMap.putIfAbsent(plantName, new ArrayList<>());
            ratingMap.get(plantName).add(0.0);

        }
        String input = scanner.nextLine();

        while (!input.equals("Exhibition")) {
            String command = input.split(": ")[0];
            String infoOnPlants = input.split(": ")[1];
            String plant = infoOnPlants.split(" - ")[0];

            if (!ratingMap.containsKey(plant)){
                System.out.println("error");
                continue;
            }

            if (command.equals("Rate")) {
                double rating = Double.parseDouble(infoOnPlants.split(" - ")[1]);
                ratingMap.get(plant).add(rating);

            } else if (command.equals("Update")) {
                int newRarity = Integer.parseInt(infoOnPlants.split(" - ")[1]);
                if (rarityMap.containsKey(plant)){
                    rarityMap.put(plant, newRarity);
                }

            } else if (command.equals("Reset")) {
                 ratingMap.get(plant).clear();

            }

            input = scanner.nextLine();
        }
        System.out.println("Plants for the exhibition:");
        rarityMap.entrySet().forEach(entry -> System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", entry.getKey(), entry.getValue(), ratingMap.get(entry.getKey()).stream()
                .mapToDouble(Double::doubleValue)
                .average().orElse(0.0)));


    }
}
