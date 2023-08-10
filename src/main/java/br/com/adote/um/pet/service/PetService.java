package br.com.adote.um.pet.service;

import br.com.adote.um.pet.dto.PetDTO;
import br.com.adote.um.pet.exception.NotFoundException;
import br.com.adote.um.pet.exception.utils.ErrorCode;
import br.com.adote.um.pet.mapper.PetMapper;
import br.com.adote.um.pet.repository.PetReporitory;
import br.com.adote.um.pet.entity.Pet;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import static br.com.adote.um.pet.mapper.PetMapper.*;


@Service
@RequiredArgsConstructor
public class PetService {

    private final PetReporitory petReporitory;

    public PetDTO savePet(PetDTO petDTO){
        Pet pet = petReporitory.save(petDTOToPet(petDTO));
        return petToPetDTO(pet);
    }

    public List<PetDTO> getAllPets(){
        return petReporitory.findAll()
                .stream()
                .map(PetMapper::petToPetDTO)
                .toList();
    }

    public PetDTO getPetById(Long id){
        Pet pet = petReporitory.findById(id)
                .orElseThrow(() -> new NotFoundException("Pet %d not found", id, ErrorCode.PET_NOT_FOUND));

        return petToPetDTO(pet);
    }

    public String deletePet(Long id){
        Pet pet = petReporitory.findById(id)
                .orElseThrow(() -> new NotFoundException("Pet %d not found", id, ErrorCode.PET_NOT_FOUND));

        petReporitory.delete(pet);
        return String.format("Pet %d deleted successfully", id);
    }
}
