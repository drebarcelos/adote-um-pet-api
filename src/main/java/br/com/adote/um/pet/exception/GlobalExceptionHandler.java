package br.com.adote.um.pet.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import static br.com.adote.um.pet.exception.ErrorMessage.createErrorMessage;
import static org.springframework.http.HttpStatus.*;

@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(PetNotFoundException.class)
    public ResponseEntity<Object> handlePetNotFoundException(PetNotFoundException exception, WebRequest request){
        ErrorMessage errorMessage = createErrorMessage(BAD_REQUEST, exception.getMessage());

        return handleExceptionInternal(exception, errorMessage, new HttpHeaders(), BAD_REQUEST, request);
    }

}
