package com.henriqlimac.posbjpa.resources.exceptions;

import com.henriqlimac.posbjpa.services.exceptions.DatabaseException;
import com.henriqlimac.posbjpa.services.exceptions.ResourceNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException exception, HttpServletRequest request) {
        String errorMessage = "Resource not found";
        HttpStatus status = HttpStatus.NOT_FOUND;
        StandardError error = new StandardError(Instant.now(), status.value(), errorMessage, exception.getMessage(), request.getRequestURI());

        return ResponseEntity.status(status).body(error);
    }

    @ExceptionHandler(DatabaseException.class)
    public ResponseEntity<StandardError> database(DatabaseException exception, HttpServletRequest request) {
        String errorMessage = "Database error";
        HttpStatus status = HttpStatus.BAD_REQUEST;
        StandardError error =  new StandardError(Instant.now(), status.value(), errorMessage, exception.getMessage(), request.getRequestURI());

        return ResponseEntity.status(status).body(error);
    }
}
