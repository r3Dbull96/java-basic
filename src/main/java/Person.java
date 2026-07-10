// Задача 1. Знакомство с классами и переменными

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    void introduce(){
        System.out.println("Привет, меня зовут " + firstName + " " + lastName + ". Мне " + age + " лет.");
    }

    public static void main(String[] args) {
//        Person person = new Person();
//        person.introduce();

        Person person1 = new Person("Вася", "Пупкин", 18);
        Person person2 = new Person("Петя", "Петушок", 5);
        Person person3 = new Person("Джейсон", "Степлер", 40);
        person1.introduce();
        person2.introduce();
        person3.introduce();
    }
}



