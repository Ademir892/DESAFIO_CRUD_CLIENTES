package com.Desafio_Crud_Clientes.Desafio_CRUD_Clientes.services.exceptions;

public class ResourceNotFoundException extends  RuntimeException{

    public ResourceNotFoundException(String msg){
        super(msg);
    }
}
