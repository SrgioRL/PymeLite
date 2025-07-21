package com.pymelite.inventoryservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryController {

    @GetMapping("/health")
    public String health() {
        return "Inventory Service is UP and Working";
    }
}
