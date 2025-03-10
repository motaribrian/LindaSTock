package org.codewithmotari.lindastock.service;

import org.codewithmotari.lindastock.domain.Productdto;
import org.codewithmotari.lindastock.model.Product;
import org.codewithmotari.lindastock.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceimpl implements ProductService {

    private final ProductRepo productRepo;
    @Autowired
    public ProductServiceimpl(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    @Override
    public boolean saveAllChangesToDb() {
        try {
            productRepo.flush();
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }

    @Override
    public Optional<Product> getProductById(int id) {
        return productRepo.findById(id);
    }

    @Override
    public List<Product> getAllProducts() {
        System.out.println("printing all products");
        return productRepo.findAll();
    }

    @Override
    public Product addProduct(Productdto pdto) {
        Product product = new Product();
        product.setName(pdto.getName());
        product.setUnitQuantity(pdto.getUnit());
        product.setDescription(pdto.getDescription());
        product.setPrice(pdto.getPrice());
        return productRepo.save(product);
    }

    @Override
    public void deleteProduct(Product product) {
        productRepo.delete(product);
    }

    @Override
    public void deleteProductById(int id) {
        productRepo.deleteById(id);
    }
}
