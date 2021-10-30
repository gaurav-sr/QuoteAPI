package com.gsequity.quoteapi;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class QuoteController {

    @GetMapping(path = "/hello", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<QuoteResponse> hello() {
        return new ResponseEntity<>(QuoteResponse.builder()
                .message(new Date().toString())
                .build(), HttpStatus.OK);
    }
}
