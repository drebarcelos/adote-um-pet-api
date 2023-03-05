package br.com.adote.um.pet.controller;

import br.com.adote.um.pet.dto.PetRequest;
import br.com.adote.um.pet.entity.Pet;
import br.com.adote.um.pet.exception.PetNotFoundException;
import br.com.adote.um.pet.service.PetService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class PetController {

    private final PetService petService;

    @PostMapping(path = "/cadastro/pet")
    public ResponseEntity<Object> petRegister(@RequestBody PetRequest petRequest){
        return ResponseEntity.status(HttpStatus.CREATED).body(petService.savePet(petRequest));
    }

    @GetMapping("/pets")
    public ResponseEntity<List<Pet>> getRegisters(){
        return ResponseEntity.status(HttpStatus.OK).body(petService.getAllPets());
    }

    @GetMapping("/pets/{id}")
    public ResponseEntity<Pet> getRegister(@PathVariable Long id){
        Optional<Pet> petOptional = petService.getPet(id);

        return petOptional
                .map(pet -> ResponseEntity.status(HttpStatus.OK).body(pet))
                .orElseThrow(() -> new PetNotFoundException(id));
    }
}
