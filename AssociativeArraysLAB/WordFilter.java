package AssociativeArraysLAB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] wordsArr = Arrays.stream(scanner.nextLine().split(" "))
                .filter(w -> w.length() % 2 == 0)
                .toArray(String[]::new);

        System.out.println(String.join(System.lineSeparator(), wordsArr));
        //String[] wordsArr = scanner.nextLine().split(" ");

//        List<String> resultList = new ArrayList<>();
//        for (String item : wordsArr){
//            if (item.length() % 2 == 0){
//                resultList.add(item);
//            }
//        }
    }
}
