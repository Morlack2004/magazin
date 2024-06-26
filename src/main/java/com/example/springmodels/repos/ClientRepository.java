package com.example.springmodels.repos;

import com.example.springmodels.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {
    Client findByLogin(String login);
}
