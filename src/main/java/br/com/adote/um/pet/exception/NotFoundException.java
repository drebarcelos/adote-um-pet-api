package br.com.adote.um.pet.exception;

import br.com.adote.um.pet.exception.utils.ErrorCode;
import lombok.Getter;

@Getter
public class NotFoundException extends RuntimeException{

    private final ErrorCode errorCode;

    public NotFoundException(String message, Long id, ErrorCode errorCode) {
        super(String.format(message, id));
        this.errorCode = errorCode;
    }
}
