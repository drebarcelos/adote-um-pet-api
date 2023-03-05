package br.com.adote.um.pet.service;

import br.com.adote.um.pet.dto.PetRequest;
import br.com.adote.um.pet.repository.PetReporitory;
import br.com.adote.um.pet.entity.Pet;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PetService {

    private final PetReporitory petReporitory;

    public Pet savePet(PetRequest petRequest){
        Pet pet = Pet.builder()
                .name(petRequest.getName())
                .specie(petRequest.getSpecie())
                .gender(petRequest.getGender())
                .size(petRequest.getSize())
                .age(petRequest.getAge())
                .coatLength(petRequest.getCoatLength())
                .behavior(petRequest.getBehavior())
                .build();
        return petReporitory.save(pet);
    }

    public List<Pet> getAllPets(){
        return petReporitory.findAll();
    }
}
