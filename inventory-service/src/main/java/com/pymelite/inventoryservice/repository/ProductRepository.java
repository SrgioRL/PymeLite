package com.pymelite.inventoryservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pymelite.inventoryservice.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
