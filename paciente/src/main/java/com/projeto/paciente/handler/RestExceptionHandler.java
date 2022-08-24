package com.projeto.paciente.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.projeto.paciente.model.ErrorMensage.ErrorMensage;
import com.projeto.paciente.model.exception.ResponseNotFoundException;

@ControllerAdvice
public class RestExceptionHandler {
    
    @ExceptionHandler(ResponseNotFoundException.class)
    public ResponseEntity<?> handleResponseNotException(ResponseNotFoundException ex) {
        ErrorMensage error = new ErrorMensage("Not Found", HttpStatus.NOT_FOUND.value(), ex.getMessage());
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);

    }

}
