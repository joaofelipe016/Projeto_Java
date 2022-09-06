package com.projeto.paciente.model.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class ResponseNotFoundException extends RuntimeException {
    
    public ResponseNotFoundException (String mensagem){
        super(mensagem);
    }

}
