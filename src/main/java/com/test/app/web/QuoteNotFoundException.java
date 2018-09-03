package com.test.app.web;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Not Found")
public class QuoteNotFoundException extends Exception {

    public QuoteNotFoundException(String quoteName) {
        super("Unknown quote: " + quoteName);
    }
}