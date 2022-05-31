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
@Getter @Setter
@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idExp;
    private String nombreExp;
    private int anioInExp;
    private int anioFinExp;
    private String descExp;
    private String imgExp;

    public Experiencia() {
    }

    public Experiencia(Long idExp, String nombreExp, int anioInExp, int anioFinExp, String descExp, String imgExp) {
        this.idExp = idExp;
        this.nombreExp = nombreExp;
        this.anioInExp = anioInExp;
        this.anioFinExp = anioFinExp;
        this.descExp = descExp;
        this.imgExp = imgExp;
    }
    
    
}
