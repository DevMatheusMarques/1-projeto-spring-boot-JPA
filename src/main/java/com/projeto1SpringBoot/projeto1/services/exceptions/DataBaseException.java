package com.projeto1SpringBoot.projeto1.services.exceptions;

public class DataBaseException extends RuntimeException {
    public DataBaseException(String message) {
        super(message);
    }
}
