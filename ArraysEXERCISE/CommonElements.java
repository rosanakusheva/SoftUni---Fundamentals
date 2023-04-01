package ArraysEXERCISE;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstRow = scanner.nextLine();
        String secondRow = scanner.nextLine();

        String[] firstArr = firstRow.split(" ");
        String[] secondArr = secondRow.split(" ");

        for (String secondElement : secondArr){

            for ( String firstElement : firstArr){
                if (secondElement.equals(firstElement)){
                    System.out.print(firstElement + " ");
                    break;
                }
            }
        }
    }
}
