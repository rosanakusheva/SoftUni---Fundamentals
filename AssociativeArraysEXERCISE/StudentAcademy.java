package AssociativeArraysEXERCISE;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> studentsMap = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String studentName = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!studentsMap.containsKey(studentName)) {
                studentsMap.put(studentName, new ArrayList<>());
                studentsMap.get(studentName).add(grade);
            } else {
                studentsMap.get(studentName).add(grade);
            }

        }
        Map<String, Double> studentAverageGrade = new LinkedHashMap<>();
        for (Map.Entry<String, List<Double>> entry : studentsMap.entrySet()) {

            String studentName = entry.getKey();
            List<Double> grades = entry.getValue();
            double averageGrade = getAverageGrade(grades);
            if (averageGrade >= 4.50) {
                studentAverageGrade.put(studentName, averageGrade);
            }
        }

        studentAverageGrade.entrySet()
                .forEach(entry -> System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue()));

    }

    private static double getAverageGrade(List<Double> grades) {
        double sumGrades = 0;
        for (double grade : grades) {
            sumGrades += grade;
        }
        return sumGrades / grades.size();
    }
}






