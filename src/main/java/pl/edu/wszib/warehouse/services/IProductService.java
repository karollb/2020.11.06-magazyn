package pl.edu.wszib.warehouse.services;

import pl.edu.wszib.warehouse.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> getAllProducts();
}
