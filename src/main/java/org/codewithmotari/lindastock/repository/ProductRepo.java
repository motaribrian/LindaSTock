package org.codewithmotari.lindastock.repository;

import org.codewithmotari.lindastock.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
