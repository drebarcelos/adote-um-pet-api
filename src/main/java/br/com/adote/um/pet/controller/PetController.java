package br.com.adote.um.pet.controller;

import br.com.adote.um.pet.dto.PetDTO;
import br.com.adote.um.pet.entity.Pet;
import br.com.adote.um.pet.service.PetService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PetController {

    private final PetService petService;

    @PostMapping(path = "/cadastro/pet")
    public ResponseEntity<Object> savePet(@RequestBody PetDTO petDTO){
        return ResponseEntity.status(HttpStatus.CREATED).body(petService.savePet(petDTO));
    }

    @GetMapping("/pets")
    public ResponseEntity<List<Pet>> getAllPets(){
        return ResponseEntity.status(HttpStatus.OK).body(petService.getAllPets());
    }

    @GetMapping("/pets/{id}")
    public ResponseEntity<PetDTO> getPet(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(petService.getPetById(id));
    }

    @DeleteMapping("/pets/{id}")
    public ResponseEntity<Object> deletePet(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(petService.deletePet(id));
    }
}
