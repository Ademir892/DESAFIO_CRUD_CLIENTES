package com.Desafio_Crud_Clientes.Desafio_CRUD_Clientes.services.exceptions;

import org.springframework.validation.Errors;

public class DatabaseException extends RuntimeException {

    public DatabaseException(String msg){
        super(msg);
    }

}
