package br.com.adote.um.pet.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "pet")
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String specie;

    @Column(nullable = false)
    private String gender;

    @Column(nullable = false)
    private String size;

    @Column(nullable = false)
    private String age;

    @Column(nullable = false)
    private String coatLength;

    @Column(nullable = false)
    private String behavior;
}
