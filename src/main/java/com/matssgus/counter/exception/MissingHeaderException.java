package com.matssgus.counter.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class MissingHeaderException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public MissingHeaderException(String message) {
        super(message);
    }
}
