package AssociativeArraysEXERCISE;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        Map<Character, Integer> characterMap = new LinkedHashMap<>();

        for (char symbol : text.toCharArray()){
            if (symbol == ' '){
                continue;
            }

            if (characterMap.containsKey(symbol)){
                int currentCount = characterMap.get(symbol);
                characterMap.put(symbol, currentCount + 1);

            } else {
                characterMap.put(symbol, 1);
            }
        }
        characterMap.forEach((key, value) -> System.out.println(key + " -> " + value));

    }
}
