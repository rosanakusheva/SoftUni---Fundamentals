package MidExamExercise;

import java.util.*;
import java.util.stream.Collectors;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int sum = 0;
        for (int i = 0; i <= numbers.size() - 1; i++) {
            int currentNum = numbers.get(i);
            sum += currentNum;
        }

        double average = sum * 1.0 / numbers.size();

        List<Integer> topNumbers = new ArrayList<>();
        for (int num = 0; num <= numbers.size() - 1; num++) {
            int currentElement = numbers.get(num);
            if (currentElement > average) {
                topNumbers.add(currentElement);
            }
        }
        Collections.sort(topNumbers);
        Collections.reverse(topNumbers);

        if (topNumbers.size() > 0) {
            if (topNumbers.size() < 5) {
                System.out.println(topNumbers.toString()
                        .replace("[", "")
                        .replace("]", "")
                        .replace(",", ""));
            } else {
                int count = 0;
                for (int number : topNumbers){
                    System.out.print(number + " ");
                    count++;
                    if (count == 5){
                        break;
                    }
                }
            }
        } else {
            System.out.println("No");
        }
    }
}
