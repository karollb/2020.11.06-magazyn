package pl.edu.wszib.warehouse.database;

import pl.edu.wszib.warehouse.model.Product;

import java.util.ArrayList;
import java.util.List;


public class DataBase implements IDataBase {
    private final List<Product> products = new ArrayList<>();

    public DataBase() {
        this.products.add(new Product("Monitor", "abc123", 10));
        this.products.add(new Product("Klawiatura", "aaa111", 2));
        this.products.add(new Product("Mysz", "bbb222", 19));

    }

    @Override
    public boolean createProduct(String name, String code, int quantity) {
        for (Product currentProduct : this.products) {
            if (currentProduct.getCode().equals(code)) {
                return false;
            }
        }

        this.products.add(new Product(name, code, quantity));
        return true;
    }

    @Override
    public boolean addProducts(String code, int quantity) {
        for (Product currentProduct : this.products) {
            if (currentProduct.getCode().equals(code)) {
                currentProduct.setQuantity(currentProduct.getQuantity() + quantity);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean takeProducts(String code, int quantity) {
        for (Product currentProduct : this.products) {
            if (currentProduct.getCode().equals(code) && currentProduct.getQuantity() >= quantity) {
                currentProduct.setQuantity(currentProduct.getQuantity() - quantity);
                return true;
            }
        }


        return false;
    }

    @Override
    public List<Product> getAllProducts() {
        return this.products;
    }
}
