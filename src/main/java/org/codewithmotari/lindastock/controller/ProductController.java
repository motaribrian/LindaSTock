package org.codewithmotari.lindastock.controller;

import org.codewithmotari.lindastock.domain.Productdto;
import org.codewithmotari.lindastock.model.Product;
import org.codewithmotari.lindastock.repository.ProductRepo;
import org.codewithmotari.lindastock.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final ProductService productService;

    @Autowired
    public ProductController(ProductRepo productRepo, ProductService productService) {
        this.productService = productService;
    }
    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Productdto product) {
        return productService.addProduct(product);
    }
}
