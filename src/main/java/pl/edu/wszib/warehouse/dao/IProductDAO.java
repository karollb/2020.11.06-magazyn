package pl.edu.wszib.warehouse.dao;

import pl.edu.wszib.warehouse.model.Product;

import java.util.List;

public interface IProductDAO {
    Product getProductById(int id);
    List<Product> getAllProducts();

}
