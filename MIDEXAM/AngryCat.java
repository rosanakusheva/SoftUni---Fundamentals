package MIDEXAM;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AngryCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> prices = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int entryPoint = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int leftSum = 0;
        int rightSum = 0;

        if (input.equals("cheap")) {
            List<Integer> leftList = prices.subList(0, entryPoint);

            for (int left = 0; left < leftList.size(); left++) {
                int currentElement = leftList.get(left);
                if (currentElement < prices.get(entryPoint)) {
                    leftSum += currentElement;
                }
            }
            List<Integer> rightList = prices.subList(entryPoint + 1, prices.size() );
            for (int right = 0; right < rightList.size(); right++) {
                int currentElement = rightList.get(right);
                if (currentElement < prices.get(entryPoint)) {
                    rightSum += currentElement;
                }
            }


        } else if (input.equals("expensive")) {


            List<Integer> leftList = prices.subList(0, entryPoint);

            for (int left = 0; left < leftList.size(); left++) {
                int currentElement = leftList.get(left);
                if (currentElement >= prices.get(entryPoint)) {
                    leftSum += currentElement;
                }
            }
            List<Integer> rightList = prices.subList(entryPoint + 1, prices.size() );
            for (int right = 0; right < rightList.size(); right++) {
                int currentElement = rightList.get(right);
                if (currentElement >= prices.get(entryPoint)) {
                    rightSum += currentElement;
                }
            }

        }
//        int MaxSum = Math.max(leftSum, rightSum);
        if (leftSum >= rightSum){
            System.out.printf("Left - %d",leftSum );
        } else  {
            System.out.printf("Right - %d",rightSum );
        }

    }

}

