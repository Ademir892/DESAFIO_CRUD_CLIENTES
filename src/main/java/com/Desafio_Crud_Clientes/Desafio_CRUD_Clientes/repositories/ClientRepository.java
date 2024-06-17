package com.Desafio_Crud_Clientes.Desafio_CRUD_Clientes.repositories;


import com.Desafio_Crud_Clientes.Desafio_CRUD_Clientes.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
