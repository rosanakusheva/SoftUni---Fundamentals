package MidExamExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> targets = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();
        int shotsCount = 0;
        while (!input.equals("End")) {

            int index = Integer.parseInt(input);

            int transformedNum = -1;

            if (index >= 0 && index <= targets.size() - 1) {

                int currentTarget = targets.get(index);
                if (currentTarget != -1) {
                    targets.set(index, transformedNum);
                    shotsCount++;

                    for (int i = 0; i <= targets.size() - 1; i++) {
                        int element = targets.get(i);
                        if (element != -1) {
                            if (currentTarget < element) {
                                targets.set(i, element - currentTarget);
                            } else {
                                targets.set(i, element + currentTarget);
                            }
                        }
                    }
                }
            }
            input = scanner.nextLine();
        }
        System.out.printf("Shot targets: %d -> ", shotsCount);
        for (int element : targets) {
            System.out.print(element + " ");
        }
    }
}
