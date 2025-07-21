package com.pymelite.clientservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pymelite.clientservice.model.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
