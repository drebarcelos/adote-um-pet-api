package br.com.adote.um.pet.mapper;

import br.com.adote.um.pet.dto.PetDTO;
import br.com.adote.um.pet.entity.Pet;

public class PetMapper {

    public static Pet petDTOToPet(PetDTO petDTO){
        return Pet.builder()
                .name(petDTO.getName())
                .specie(petDTO.getSpecie())
                .gender(petDTO.getGender())
                .size(petDTO.getSize())
                .age(petDTO.getAge())
                .coatLength(petDTO.getCoatLength())
                .behavior(petDTO.getBehavior())
                .build();
    }

    public static PetDTO petToPetDTO(Pet pet){
        return PetDTO.builder()
                .name(pet.getName())
                .specie(pet.getSpecie())
                .gender(pet.getGender())
                .size(pet.getSize())
                .age(pet.getAge())
                .coatLength(pet.getCoatLength())
                .behavior(pet.getBehavior())
                .build();
    }
}
