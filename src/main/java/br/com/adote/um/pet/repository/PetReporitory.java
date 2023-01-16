package br.com.adote.um.pet.repository;

import br.com.adote.um.pet.entity.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetReporitory extends JpaRepository<Pet, Long> {
}
