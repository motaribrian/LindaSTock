package org.codewithmotari.lindastock.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.codewithmotari.lindastock.domain.Productdto;
import org.codewithmotari.lindastock.domain.unitQuantity;

import java.time.LocalDate;
@Entity
public class Product {
    @Setter
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    private double price;
    private org.codewithmotari.lindastock.domain.unitQuantity unitQuantity;

    private int quantity;

    private String description;

    private LocalDate ExpiryDate;

    private unitQuantity unit;


    public Product() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public org.codewithmotari.lindastock.domain.unitQuantity getUnitQuantity() {
        return unitQuantity;
    }

    public void setUnitQuantity(org.codewithmotari.lindastock.domain.unitQuantity unitQuantity) {
        this.unitQuantity = unitQuantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getExpiryDate() {
        return ExpiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        ExpiryDate = expiryDate;
    }

    public org.codewithmotari.lindastock.domain.unitQuantity getUnit() {
        return unit;
    }

    public void setUnit(org.codewithmotari.lindastock.domain.unitQuantity unit) {
        this.unit = unit;
    }
}
