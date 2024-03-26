package java102.PatikaStore;

import java.util.Scanner;

public class StoreManager {
    public void run() {
        PatikaStore store = new PatikaStore();
        store.addSampleData();

        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\n1. List Products");
            System.out.println("2. List Brands");
            System.out.println("3. Filter Products by Brand");
            System.out.println("4. Filter Products by ID");
            System.out.println("5. Product Operations (Add/Delete)");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    store.listProducts();
                    break;
                case 2:
                    listBrands(store);
                    break;
                case 3:
                    filterProductsByBrand(store, scanner);
                    break;
                case 4:
                    System.out.print("Enter product ID: ");
                    int productId = scanner.nextInt();
                    store.filterProductsById(productId);
                    break;
                case 5:
                    System.out.println("<A>dd or <D>elete Product");
                    String addDeleteChoice = scanner.nextLine().toLowerCase();
                    if (addDeleteChoice.equals("a")) {
                        System.out.println("Enter unit price: ");
                        double addPrice = scanner.nextDouble();
                        System.out.println("Enter discount rate: ");
                        double addDiscountRate = scanner.nextDouble();
                        System.out.println("Enter stock quantity: ");
                        int addStock = scanner.nextInt();
                        System.out.println("Enter the name of the product: ");
                        scanner.nextLine(); // Consume newline character
                        String addName = scanner.nextLine();
                        System.out.println("Enter the id of the brand: ");
                        int addBrandId = scanner.nextInt();
                        scanner.nextLine(); // Consume newline character
                        System.out.print("Enter your choice <M>obile Phone or <N>otebook: ");
                        String addChoice = scanner.nextLine().toLowerCase();
                        switch (addChoice) {
                            case "m":
                                System.out.println("Enter the color: ");
                                String addColor = scanner.nextLine();
                                System.out.println("Enter memory: ");
                                String addMemory = scanner.nextLine();
                                System.out.println("Enter screen size: ");
                                double addScreenSize = scanner.nextDouble();
                                System.out.println("Enter battery power: ");
                                int addBattery = scanner.nextInt();
                                System.out.println("Enter ram: ");
                                int addRam = scanner.nextInt();
                                scanner.nextLine(); // Consume newline character
                                MobilePhone newProduct = new MobilePhone(addPrice, addDiscountRate, addStock, addName, store.getBrands().get(addBrandId), addMemory, addScreenSize, addBattery, addRam, addColor);
                                break;
                            case "n":
                                System.out.println("ram");
                                int addNotebookRam = scanner.nextInt();
                                System.out.println("storage");
                                int addNotebookStorage = scanner.nextInt();
                                System.out.println("screen size");
                                double addNotebookScreenSize = scanner.nextDouble();
                                scanner.nextLine(); // Consume newline character
                                Notebook newNotebook = new Notebook(addPrice, addDiscountRate, addStock, addName, store.getBrands().get(addBrandId), addNotebookRam, addNotebookStorage, addNotebookScreenSize);
                                break;
                        }
                    } else if (addDeleteChoice.equals("d")) {
                        System.out.print("Enter the ID of the product to delete: ");
                        int deleteProductId = scanner.nextInt();
                        scanner.nextLine(); // Consume newline character
                        store.deleteProduct(deleteProductId);
                    } else {
                        System.out.println("You have entered an invalid operation please try again!");
                    }
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);
    }

    private static void listBrands(PatikaStore store) {
        System.out.println("Brands:");
        for (Brand brand : store.getBrands()) {
            System.out.println("- " + brand.getName());
        }
    }

    private static void filterProductsByBrand(PatikaStore store, Scanner scanner) {
        System.out.print("Enter brand name: ");
        String brand = scanner.nextLine();
        store.filterProductsByBrand(brand);
    }
}
