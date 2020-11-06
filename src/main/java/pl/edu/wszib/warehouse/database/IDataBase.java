package pl.edu.wszib.warehouse.database;

import pl.edu.wszib.warehouse.model.Product;

import java.util.List;

public interface IDataBase {
    boolean createProduct(String name, String code, int quantity);

    boolean addProducts(String code, int quantity);

    boolean takeProducts(String code, int quantity);

    List<Product> getAllProducts();
}
