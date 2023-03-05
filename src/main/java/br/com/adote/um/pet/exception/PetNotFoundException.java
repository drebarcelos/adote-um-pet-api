package br.com.adote.um.pet.exception;

public class PetNotFoundException extends RuntimeException{

    public PetNotFoundException(Long id) {
        super(String.format("Pet %d not found", id));
    }
}
