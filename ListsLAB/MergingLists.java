package ListsLAB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> result = new ArrayList<>();

        if (firstList.size() >= secondList.size()){

            for (int i = 0; i < firstList.size(); i++) {
                result.add(firstList.get(i));

                if (i < secondList.size()){
                    result.add(secondList.get(i));
                }

            }
        } else {
            for (int i = 0; i < secondList.size(); i++) {

                if (i < firstList.size()){
                    result.add(firstList.get(i));
                }

                result.add(secondList.get(i));

            }
        }
        System.out.print(result.toString().replace("[", "")
                .replace("]", "")
                .replace(",", ""));
    }
}
// int minSize = Math.min(firstList.size(), secondList.size());
//        for (int i = 0; i < minSize; i++) {
//            int firstItem = firstList.get(i);
//            int secondItem = secondList.get(i);
//
//            resultList.add(firstItem);
//            resultList.add(secondItem);
//        }
//
//        if (first.size() > secondList.size()) {
//            result.addAll(firstList.subList(minSize, firstList.size()));
//        } else {
//            result.addAll(secondList.subList(minSize, secondList.size()));
//        }
//
//        System.out.println(result.toString().replaceAll("[\\[\\],]", ""));
//    }
//}