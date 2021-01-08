package pl.edu.wszib.warehouse.dao;

import pl.edu.wszib.warehouse.model.Product;

import java.util.List;

public interface IProductDAO {
    List<Product> getAllProducts();
    void updateProduct(Product product);
    Product getProductById(int id);

}
