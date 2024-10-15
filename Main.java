import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Class representing a product
class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " - $" + price;
    }
}

// Class representing the shopping cart
class ShoppingCart {
    private List<Product> cartItems;

    public ShoppingCart() {
        cartItems = new ArrayList<>();
    }

    public void addItem(Product product) {
        cartItems.add(product);
    }

    public void viewCart() {
        if (cartItems.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            System.out.println("Your cart contains:");
            for (Product product : cartItems) {
                System.out.println(product);
            }
        }
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Scanner scanner = new Scanner(System.in);
        
        // Adding products to the cart
        cart.addItem(new Product("Apple", 0.99));
        cart.addItem(new Product("Bread", 1.49));
        
        // Viewing the cart
        cart.viewCart();

        scanner.close();
    }
}
