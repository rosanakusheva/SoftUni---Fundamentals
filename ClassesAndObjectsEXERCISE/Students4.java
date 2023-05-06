package ClassesAndObjectsEXERCISE;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Students4 {
    static class Student {
        String firstName;

        String lastName;
        double grade;

        public Student(String fn, String ln, double grade) {
            this.firstName = fn;
            this.lastName = ln;
            this.grade = grade;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public double getGrade() {
            return grade;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int countStudents = Integer.parseInt(scanner.nextLine());

        List<Student> studentList = new ArrayList<>();

        for (int i = 1; i <= countStudents; i++) {
            String data = scanner.nextLine();

            String firstName = data.split("\\s+")[0];
            String lastName = data.split("\\s+")[1];
            double grade = Double.parseDouble(data.split("\\s+")[2]);


            Student student1 = new Student(firstName, lastName, grade);
            studentList.add(student1);
        }

        studentList.sort(Comparator.comparing(Student::getGrade).reversed());

        for (Student student : studentList) {
            System.out.printf("%s %s: %.2f%n", student.getFirstName(), student.getLastName(), student.getGrade());

        }


    }
}
