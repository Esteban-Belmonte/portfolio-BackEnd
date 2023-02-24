package com.portfolio.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nombreSkill;
    private int gradoSkill;

    public Skill() {
    }

    public Skill(Long id, String nombreSkill, int gradoSkill) {
        this.id = id;
        this.nombreSkill = nombreSkill;
        this.gradoSkill = gradoSkill;
    }

}
