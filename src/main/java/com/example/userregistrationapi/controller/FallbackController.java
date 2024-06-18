package com.example.userregistrationapi.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController implements ErrorController {

    @RequestMapping("/")
    public ResponseEntity<String> handleUnmappedRequests() {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body("The requested resource was not found.");
    }

    @RequestMapping("/error")
    public ResponseEntity<String> handleError() {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body("An error occurred while processing the request.");
    }
}