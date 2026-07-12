import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Product, Integer> products;

    public Cart(Map<Product, Integer> products) {
        this.products = products;
    }

    void addProduct(Product product, int quantity) {
        if (products.containsKey(product)) {
            products.put(product, products.get(product) + quantity);
        } else {
            products.put(product, quantity);
        }
    }

    double getTotalPrice() {
        double totalPrice = 0;

        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            Product product = entry.getKey();
            int quantity = entry.getValue();

            totalPrice += product.getPrice() * quantity;

        }
        return totalPrice;
    }

    int getProductCount() {
        int totalCount = 0;

        for (Map.Entry<Product, Integer> product : products.entrySet()) {
            totalCount += product.getValue();
        }

        return totalCount;
    }

    public static void main(String[] args) {
        Product apple = new Product("Яблоко", 10.5);
        Product banana = new Product("Банан", 20.5);
        Product chicken = new Product("Курица", 30.5);

        Cart cart = new Cart(new HashMap<>());
        cart.addProduct(apple, 1);
        cart.addProduct(apple, 1);
        cart.addProduct(banana, 2);
        cart.addProduct(chicken, 3);

        System.out.println(cart.getProductCount());
        System.out.println(cart.getTotalPrice());
    }
}
