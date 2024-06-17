package com.Desafio_Crud_Clientes.Desafio_CRUD_Clientes.dto;

import com.Desafio_Crud_Clientes.Desafio_CRUD_Clientes.entities.Client;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;

import java.time.LocalDate;

public class ClientDTO {

    private Long id;

    @NotBlank(message = "Nome não pode ser vazio")
    private String name;

    private String cpf;

    private Double income;

    @PastOrPresent(message = "Data de nascimento não pode ser data futura")
    private LocalDate birthDate;

    private Integer children;

    public ClientDTO(ClientDTO x){
    }

    public ClientDTO(Client entity){
        id = entity.getId();
        name = entity.getName();
        cpf = entity.getCpf();
        income = entity.getIncome();
        birthDate = entity.getBirthDate();
        children = entity.getChildren();
    }

    public Long getId() { return id; }

    public String getName() { return name; }

    public String getCpf() { return cpf; }

    public Double getIncome() { return income; }

    public LocalDate getBirthDate() { return birthDate; }

    public Integer getChildren() { return children; }


}
