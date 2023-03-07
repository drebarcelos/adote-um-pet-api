package br.com.adote.um.pet.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
@AllArgsConstructor
public class PetDTO {
    private String name;
    private String specie;
    private String gender;
    private String size;
    private String age;
    private String coatLength;
    private String behavior;
}
