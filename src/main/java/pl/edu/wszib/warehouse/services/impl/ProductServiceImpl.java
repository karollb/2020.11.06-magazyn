package pl.edu.wszib.warehouse.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.wszib.warehouse.dao.IProductDAO;
import pl.edu.wszib.warehouse.model.Product;
import pl.edu.wszib.warehouse.services.IProductService;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    IProductDAO productDAO;

    @Override
    public List<Product> getAllProducts() {
        return this.productDAO.getAllProducts();
    }
}
