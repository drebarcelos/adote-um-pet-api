package br.com.adote.um.pet.controller;

import br.com.adote.um.pet.dto.PetRequest;
import br.com.adote.um.pet.service.PetService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PetController {

    private final PetService petService;

    @PostMapping(path = "/cadastro/pet")
    public ResponseEntity<Object> petRegister(@RequestBody PetRequest petRequest){
        return ResponseEntity.status(HttpStatus.CREATED).body(petService.savePet(petRequest));
    }
}