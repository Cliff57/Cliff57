 import java.util.HashMap;
import java.util.Map;

public class SalesClass {
    private Map<String, Double> products;

    public SalesSystem() {
        products = new HashMap<>();
    }

    public void addProduct(String productName, double price) {
        products.put(productName, price);
    }

    public void removeProduct(String productName) {
        products.remove(productName);
    }

    public double calculateTotalPrice(String[] productNames) {
        double totalPrice = 0;
        for (String productName : productNames) {
            if (products.containsKey(productName)) {
                double price = products.get(productName);
                totalPrice += price;
            }
        }
        return totalPrice;
    }

    public static void main(String[] args) {
        SalesSystem salesSystem = new SalesSystem();

        // Add products to the system
        salesSystem.addProduct("Product A", 2000.99);
        salesSystem.addProduct("Product B", 5000.99);
        salesSystem.addProduct("Product C", 15000.99);

        // Calculate total price for a list of products
        String[] productNames = {"Product A", "Product C"};
        double totalPrice = salesSystem.calculateTotalPrice(productNames);
        System.out.println("Total price: " + totalPrice);
    }
}
