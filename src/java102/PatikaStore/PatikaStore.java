package java102.PatikaStore;

import java.util.*;

public class PatikaStore {
    private List<Brand> brands;
    private List<Product> products;

    public PatikaStore() {
        brands = new ArrayList<>();
        products = new ArrayList<>();
        addSampleBrands(); // Call method to add sample brands
    }

    public void listProducts() {
        System.out.println("Notebooks");
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Product Name                      | Unit Price     | Brand     | Storage  | Screen Display     | RAM         |");
        System.out.println("----------------------------------------------------------------------------------------------------");
        for (Product product : products) {
            if ("Notebook".equals(product.getType())) {
                Notebook notebook = (Notebook) product;
                System.out.format("| %d  | %-30s | %-9.2f TL | %-9s | %-8d GB | %-8.1f inch | %-8d GB |\n",
                        product.getId(), product.getName(), product.getUnitPrice(), product.getBrand().getName(),
                        notebook.getStorage(), notebook.getScreenSize(), notebook.getRam());
            }
        }
        System.out.println("----------------------------------------------------------------------------------------------------");

        System.out.println("\nMobile Phones");
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Product Name                      | Unit Price     | Brand     | Memory   | Screen Size   | Battery    | RAM   | Color    |");
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        for (Product product : products) {
            if ("MobilePhone".equals(product.getType())) {
                MobilePhone mobilePhone = (MobilePhone) product;
                System.out.format("| %d  | %-30s | %-9.2f TL | %-9s | %-8s | %-8.1f inch | %-8d mAh | %-4d GB | %-8s |\n",
                        product.getId(), product.getName(), product.getUnitPrice(), product.getBrand().getName(),
                        mobilePhone.getMemory(), mobilePhone.getScreenSize(),
                        mobilePhone.getBatteryPower(), mobilePhone.getRam(), mobilePhone.getColor());
            }
        }
        System.out.println("------------------------------------------------------------------------------------------------------------------");
    }

    public void addBrand(Brand brand) {
        brands.add(brand);
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Product added successfully.");
    }

    public void deleteProduct(int id) {
        boolean removed = false;
        products.removeIf(product -> product.getId() == id);
        if (removed) {
            System.out.println("Product deleted successfully.");
        } else {
            System.out.println("Product with ID " + id + " not found.");
        }
    }

    public void filterProductsByBrand(String brand) {
        System.out.println("ID\t| Name\t| Brand\t| Unit Price\t| Discount\t| Stock\t|");
        System.out.println("-------------------------------------------------------------");
        for (Product product : products) {
            if (product.getBrand().getName().equals(brand)) {
                System.out.format("%s\t| %s\t| %s\t| %.2f\t| %.2f\t| %d\t|\n",
                        product.getId(), product.getName(), product.getBrand().getName(),
                        product.getUnitPrice(), product.getDiscountRate(), product.getStockQuantity());
            }
        }
    }

    public void filterProductsById(int id) {
        System.out.println("ID\t| Name\t| Brand\t| Unit Price\t| Discount\t| Stock\t|");
        System.out.println("-------------------------------------------------------------");
        for (Product product : products) {
            if (product.getId() == id) {
                System.out.format("%s\t| %s\t| %s\t| %.2f\t| %.2f\t| %d\t|\n",
                        product.getId(), product.getName(), product.getBrand().getName(),
                        product.getUnitPrice(), product.getDiscountRate(), product.getStockQuantity());
                break;
            }
        }
    }

    public List<Brand> getBrands() {
        return brands;
    }

    public void addSampleBrands() {
        Map<Integer, Brand> brandsMap = Brand.brands();
        brands.addAll(brandsMap.values());
    }

    public void addSampleData() {
        addProduct(new MobilePhone(1500, 0.1, 100, "Galaxy S21", brands.get(7),
                "128 GB", 6.1, 4000, 6, "Black"));
        addProduct(new MobilePhone(1200, 0.15, 50, "iPhone 12", brands.get(0),
                "64 GB", 6.1, 3800, 6, "Silver"));
        addProduct(new Notebook(2500, 0.1, 80, "ThinkPad X1 Carbon", brands.get(8),
                16, 512, 14));
        addProduct(new Notebook( 1800, 0.05, 30, "MacBook Air", brands.get(0),
                8, 256, 13.3));
    }


}
