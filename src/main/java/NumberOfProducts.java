import java.util.List;
import java.util.Scanner;

public class NumberOfProducts {
    // Задача 4. Цикл с условием
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> prices = List.of(199.99, 32.01, 1.99, 1004.65, 438.13);
        double amountPurchase = 0;

        System.out.print("Введите свой бюджет для покупок: ");
        double budget = scanner.nextDouble();

        int i = 0;
        while (i < prices.size() && budget >= prices.get(i)) {
            amountPurchase += prices.get(i);
            budget -= prices.get(i);
            i++;
        }

        System.out.println("Куплено: " + i + " товара на сумму " + amountPurchase);
        System.out.println("Остаток бюджета: " + budget);
        System.out.println("Не куплено: " + (prices.size() - i));
    }
}
