package br.com.adote.um.pet.exception.utils.response;

import br.com.adote.um.pet.exception.utils.ErrorCode;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class NotFoundExceptionResponse {
    private ErrorCode errorCode;
    private String message;
}
