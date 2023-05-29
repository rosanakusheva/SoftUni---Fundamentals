package AssociativeArraysEXERCISE;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<String, List<String>> companyMap = new LinkedHashMap<>();

        while (!input.equals("End")) {
            String companyName = input.split(" -> ")[0];
            String employeeId = input.split(" -> ")[1];

            if (!companyMap.containsKey(companyName)) {
                companyMap.put(companyName, new ArrayList<>());
                companyMap.get(companyName).add(employeeId);
            } else {
                if (!companyMap.get(companyName).contains(employeeId)) {
                    companyMap.get(companyName).add(employeeId);
                }

            }

            input = scanner.nextLine();
        }
        companyMap.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            entry.getValue().forEach(employeeId -> System.out.println("-- " + employeeId));
        });
    }
}
