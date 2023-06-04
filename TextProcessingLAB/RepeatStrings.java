package TextProcessingLAB;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] wordsArr= scanner.nextLine().split(" ");

        List<String> repeatList = new ArrayList<>();

        for (int i = 0; i < wordsArr.length; i++) {
            String currentWord = wordsArr[i];
            int length = currentWord.length();
            String repeatWord = repeatString(length, currentWord);
            repeatList.add(repeatWord);
        }
        System.out.println(String.join("",repeatList));
    }
    public static String repeatString (int n, String word){
        String[] arr = new String[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = word;
        }
        return String.join("", arr);


//        String result = "";
//        for (int i = 0; i < n; i++) {
//         result = result + word;
//        }
//        return result;
    }
}
