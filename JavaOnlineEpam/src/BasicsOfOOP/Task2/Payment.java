package BasicsOfOOP.Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Payment {
    private String name;
    private Product[] products;
    private int cost;

    public class Product {
        private String productName;
        private int productCost;

        public Product(String productName, int productCost) {
            this.productName = productName;
            this.productCost = productCost;
        }

        public String getProductName() {
            return this.productName;
        }

        public int getProductCost() {
            return this.productCost;
        }
    }

    public Payment(String name) {
        this.name = name;
    }

    public void setPayment() throws IOException {
        this.cost = 0;
        System.out.print("Enter the count of products to want to buy: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int count = Integer.parseInt(reader.readLine());
            products = new Product[count];
            for (int i = 0; i < count; i++) {
                System.out.println("Product " + (i + 1) + ": ");
                System.out.print("Name of product: ");
                String name = reader.readLine();
                System.out.print("Cost: ");
                int cost = Integer.parseInt(reader.readLine());
                products[i] = new Product(name, cost);
                this.cost += products[i].productCost;
            }
        } catch (NumberFormatException e) {
            System.out.println("incorrect format");
        } catch (NegativeArraySizeException e) {
            System.out.println("The dimension of the array cannot be < 0");
        } catch (NullPointerException e) {
            System.out.println("Array is not created");
        }
    }

    public void printCheque() {
        try {
            System.out.println(this.name + ":");
            for (int i = 0; i < this.products.length; i++) {
                System.out.println(i + 1 + " " + this.products[i].productName + " " + this.products[i].productCost);
            }
            System.out.print("Cost of payment: " + this.cost);
        } catch (NullPointerException e) {
            System.out.println("Array is not created");
        }
    }
}
