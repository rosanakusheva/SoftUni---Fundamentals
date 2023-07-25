import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countBarcodes = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= countBarcodes; i++) {
            String input = scanner.nextLine();
            String regex = "^@#+(?=[A-Z])(?<code>[A-Za-z0-9]{6,})(?<=[A-Z])@#+$";
           // String regex = "^(@#+)(?<code>[A-Z][A-Za-z\\d]{4,}[A-Z]])(@#+)$";
            //String regex = "^(@#+)(?<code>[A-Z][A-Za-z0-9]{4,}[A-Z])(@#+)$";
            Pattern pattern =  Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String barcode = matcher.group("code");
                StringBuilder concatDigits = new StringBuilder();

                for (char symbol : barcode.toCharArray()) {
                    if (Character.isDigit(symbol)) {
                        concatDigits.append(symbol);
                    }
                }
                if (concatDigits.toString().isEmpty()) {
                    System.out.println("Product group: " + "00");

                } else {
                    System.out.println("Product group: " + concatDigits.toString());
                }
            } else {
                System.out.println("Invalid barcode");
            }

        }
    }
}
