package OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Person> peopleList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String data = scanner.nextLine();
            String name = data.split("\\s+")[0];
            int age = Integer.parseInt(data.split("\\s+")[1]);

            if (age > 30){
                Person person = new Person(name, age);
                peopleList.add(person);

            }

        }
        for (Person person : peopleList){
            System.out.println(person.getName() + " - " + person.getAge());
        }
    }
}
