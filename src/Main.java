import controller.CharaktereController;
import controller.ProductController;
import model.Charaktere;
import model.Product;
import repo.CharaktereRepo;
import repo.ProductRepo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductRepo productRepo = new ProductRepo();
        CharaktereRepo charaktereRepo = new CharaktereRepo();

        ProductController productController = new ProductController(productRepo);
//        CharaktereController customerController = new CharaktereController(charaktereRepo);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Sports Store Management ---");
            System.out.println("1. Manage Products");
            System.out.println("2. Manage Customers");
            System.out.println("3. Exit");
            int choice;
            try {
                choice = scanner.nextInt();
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Invalid option. Please try again.");
                scanner.nextLine();
                continue;
            }
            switch (choice) {
                case 1:
                    manageProducts(scanner, productController);
                    break;
                case 2:
//                    manageCharakter(scanner, customerController);
                    break;
                case 3:
                    System.out.println("Exiting Application...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void manageProducts(Scanner scanner, ProductController productController) {
        while (true) {
            System.out.println("\n--- Manage Products ---");
            System.out.println("1. Add Product");
            System.out.println("2. View All Products");
            System.out.println("3. Update Product");
            System.out.println("4. Delete Product");
            System.out.println("5. Back to Main Menu");
            System.out.println("Choose an option: ");
            int choice;
            try {
                choice = scanner.nextInt();
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Invalid option. Please try again.");
                scanner.nextLine();
                continue;
            }
            switch (choice) {
                case 1:
                    System.out.println("Enter product name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter product price: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Enter product season: ");
                    String season = scanner.nextLine();

                    Product product = new Product(name, price, season);
                    productController.addProduct(product);
                    System.out.println("Product added successfully.");
                    break;

                case 2:
                    System.out.println("\n--- Product List ---");
                    for (Product p : productController.getAllProducts()) {
                        System.out.println(p);
                    }
                    break;

                case 3:
                    System.out.println("Enter the name of the product to update: ");
                    String updateName = scanner.nextLine();
                    System.out.println("Enter new product name: ");
                    String newName = scanner.nextLine();
                    System.out.println("Enter new product price: ");
                    double newPrice = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Enter new product season: ");
                    String newSeason = scanner.nextLine();
                    Product updatedProduct = new Product(newName, newPrice, newSeason);
                    productController.updateProduct(updateName, updatedProduct);
                    System.out.println("Product updated successfully.");
                    break;

                case 4:
                    System.out.println("Enter the name of the product to delete: ");
                    String deleteName = scanner.nextLine();
                    productController.deleteProduct(deleteName);
                    System.out.println("Product deleted successfully.");
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
    private static void manageCharakter(Scanner scanner, CharaktereRepo charaktereRepo) {

    }
}