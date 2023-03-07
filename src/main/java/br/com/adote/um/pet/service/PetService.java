package br.com.adote.um.pet.service;

import br.com.adote.um.pet.dto.PetDTO;
import br.com.adote.um.pet.exception.PetNotFoundException;
import br.com.adote.um.pet.mapper.PetMapper;
import br.com.adote.um.pet.repository.PetReporitory;
import br.com.adote.um.pet.entity.Pet;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import static br.com.adote.um.pet.mapper.PetMapper.*;


@Service
@RequiredArgsConstructor
public class PetService {

    private final PetReporitory petReporitory;

    public Pet savePet(PetDTO petDTO){
        return petReporitory.save(petDTOToPet(petDTO));
    }

    public List<Pet> getAllPets(){
        return petReporitory.findAll();
    }

    public PetDTO getPetById(Long id){
        Optional<Pet> petOptional = petReporitory.findById(id);

        return petOptional
                .map(PetMapper::petToPetDTO)
                .orElseThrow(() -> new PetNotFoundException(id));
    }

    public String deletePet(Long id){
        if(petReporitory.existsById(id)){
            petReporitory.deleteById(id);
            return String.format("Pet %d deleted successfully", id);
        }
        throw new PetNotFoundException(id);
    }
}
