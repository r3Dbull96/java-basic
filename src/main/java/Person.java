// Задача 1. Знакомство с классами и переменными

public class Person {
    String firstName = "Nikolay";
    String lastName = "Baskov";
    int age = 25;

    void introduce(){
        System.out.println("Привет, меня зовут " + firstName + " " + lastName + ". Мне " + age + " лет.");
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.introduce();
    }
}



