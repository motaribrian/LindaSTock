package org.codewithmotari.lindastock.service;

import org.codewithmotari.lindastock.domain.Productdto;
import org.codewithmotari.lindastock.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ProductService {
        boolean saveAllChangesToDb();
       //Add Product
        Product addProduct(Productdto pdto);
       //Delete Product
        void deleteProduct(Product product);
        //Delete Product By Id
        void deleteProductById(int id);
        Optional<Product> getProductById(int id);
        //findAll
        List<Product> getAllProducts();
}
