import java.util.List;
import java.util.Scanner;

public class AmountOfPrices {
    // Задача 3. Условия и математика
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> prices = List.of(199.99, 32.01, 1.99, 1004.65, 438.13);

        double totalPrice = 0;
        for (Double price : prices) {
            totalPrice += price;
        }

        System.out.print("Введите свой бюджет для покупок: ");
        double budget = scanner.nextDouble();

        System.out.println("Общая сумма товаров равна " + totalPrice);

        if (totalPrice <= budget) {
            System.out.println("Бюджета на покупки хватает! Остаток - " + (budget - totalPrice));
        } else {
            System.out.println("Бюджета на покупки не хватает! Необходимо еще " + (totalPrice - budget));
        }
    }
}