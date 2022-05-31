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
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEdu;
    private String nombreEdu;
    private int anioInEdu;
    private int anioFinEdu;
    private String descEdu;
    private String imgEdu;

    public Educacion() {
    }

    public Educacion(Long idEdu, String nombreEdu, int anioInEdu, int anioFinEdu, String descEdu, String imgEdu) {
        this.idEdu = idEdu;
        this.nombreEdu = nombreEdu;
        this.anioInEdu = anioInEdu;
        this.anioFinEdu = anioFinEdu;
        this.descEdu = descEdu;
        this.imgEdu = imgEdu;
    }
    
}
