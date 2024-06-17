package com.Desafio_Crud_Clientes.Desafio_CRUD_Clientes.dto;

public class FieldMessage {

    private String filedName;

    private String message;


    public FieldMessage(String filedName, String message) {
        this.filedName = filedName;
        this.message = message;
    }

    public String getFiledName() {
        return filedName;
    }

    public String getMessage() {
        return message;
    }
}

