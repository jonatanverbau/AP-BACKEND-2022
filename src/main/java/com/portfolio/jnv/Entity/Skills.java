/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.jnv.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Jonatan
 */
@Setter @Getter
@Entity
public class Skills {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idSkill;
    private String nombreSkill;
    private int nivelSkill;
    private String imgSkill;

    public Skills() {
    }

    public Skills(Long idSkill, String nombreSkill, int nivelSkill, String imgSkill) {
        this.idSkill = idSkill;
        this.nombreSkill = nombreSkill;
        this.nivelSkill = nivelSkill;
        this.imgSkill = imgSkill;
    }
    
    
}
