package com.templates.apirest.configuracion.exceptions;

public class PresentationNotFoundException extends RuntimeException{

    /**
     *Serial version ID para UserNotFoundExcept
     */
    private static final long serialVersionUID = 2687519956245470018L;

    public PresentationNotFoundException(String errorMessage, Throwable err) {
        super(errorMessage, err);

    
    }
}
