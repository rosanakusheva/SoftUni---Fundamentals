package ClassesAndObjectsEXERCISE;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class OrderByAge {
    static class Person {
        String name;
        String ID;
        int age;

        public Person(String name, String ID, int age) {
            this.name = name;
            this.ID = ID;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public String getID() {
            return ID;
        }

        public int getAge() {
            return age;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String data = scanner.nextLine();

        List<Person> peopleList = new ArrayList<>();

        while (!data.equals("End")) {

            String name = data.split("\\s+")[0];
            String ID = data.split("\\s+")[1];
            int age = Integer.parseInt(data.split("\\s+")[2]);

            Person person = new Person(name, ID, age);
            peopleList.add(person);


            data = scanner.nextLine();
        }
        peopleList.sort(Comparator.comparing(Person::getAge));

        for (Person person : peopleList) {
            System.out.println(person.getName() + " with ID: " + person.getID() + " is " + person.getAge() + " years old.");
        }
    }
}
