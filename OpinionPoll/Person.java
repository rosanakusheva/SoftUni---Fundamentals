package OpinionPoll;

public class Person {
    private  String name;
    private int age;

    public String getName(){
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public Person (String name, int age){
        this.name = name;
        this.age = age;

    }
}
