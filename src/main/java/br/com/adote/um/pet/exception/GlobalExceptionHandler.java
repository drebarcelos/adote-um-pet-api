package br.com.adote.um.pet.exception;

import br.com.adote.um.pet.exception.utils.response.NotFoundExceptionResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import static org.springframework.http.HttpStatus.*;

@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<NotFoundExceptionResponse> handleNotFoundException(NotFoundException e) {
        LOGGER.error(e.getMessage());
        NotFoundExceptionResponse notFoundExceptionResponse = new NotFoundExceptionResponse(e.getErrorCode(), e.getMessage());
        return ResponseEntity.status(NOT_FOUND).body(notFoundExceptionResponse);
    }

}
