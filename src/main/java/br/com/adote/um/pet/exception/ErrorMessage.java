package br.com.adote.um.pet.exception;

import lombok.Builder;
import lombok.Value;
import org.springframework.http.HttpStatus;

@Value
@Builder
public class ErrorMessage {

    Integer status;
    String message;

    public static ErrorMessage createErrorMessage(HttpStatus status, String message) {
        return ErrorMessage.builder()
                .status(status.value())
                .message(message)
                .build();
    }
}
