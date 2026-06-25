import java.util.List;

public class Fruits {
    // Задача 2. Список и цикл
    public static void main(String[] args) {
        List<String> fruits = List.of("Яблоко", "Банан", "Апельсин", "Киви", "Абрикос");

        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(i + 1 + ". " + fruits.get(i));
        }
    }
}
