package xyz;
import java.util.Scanner;

class Product {
    private int pid;
    private double price;
    private int quantity;

    // Parameterized constructor
    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters for pid, price, and quantity
    public int getPid() {
        return pid;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}

public class xyz {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
        Product[] products = new Product[5];

        // Accept five product information from the user and store in an array
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Product " + (i + 1) + " details:");
            System.out.print("Enter Pid: ");
            int pid = Scanner.nextInt();
            System.out.print("Enter Price: ");
            double price = Scanner.nextDouble();
            System.out.print("Enter Quantity: ");
            int quantity = Scanner.nextInt();

            products[i] = new Product(pid, price, quantity);
        }

        // Find Pid of the product with the highest price
        int highestPricePid = findHighestPricePid(products);
        System.out.println("Pid of the product with the highest price: " + highestPricePid);

        // Calculate and return the total amount spent on all products
        double totalAmountSpent = calculateTotalAmountSpent(products);
        System.out.println("Total amount spent on all products: " + totalAmountSpent);
    }

    // Method to find Pid of the product with the highest price
    private static int findHighestPricePid(Product[] products) {
        int highestPricePid = -1;
        double maxPrice = Double.MIN_VALUE;

        for (Product product : products) {
            if (product.getPrice() > maxPrice) {
                maxPrice = product.getPrice();
                highestPricePid = product.getPid();
            }
        }

        return highestPricePid;
    }

    // Method to calculate and return the total amount spent on all products
    private static double calculateTotalAmountSpent(Product[] products) {
        double totalAmountSpent = 0;

        for (Product product : products) {
            totalAmountSpent += product.getPrice() * product.getQuantity();
        }

        return totalAmountSpent;

	}

}
