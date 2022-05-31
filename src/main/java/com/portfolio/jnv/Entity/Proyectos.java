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
public class Proyectos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProy;
    private String nombreProy;
    private int anioProy;
    private String descProy;
    private String imgProy;

    public Proyectos() {
    }

    public Proyectos(Long idProy, String nombreProy, int anioProy, String descProy, String imgProy) {
        this.idProy = idProy;
        this.nombreProy = nombreProy;
        this.anioProy = anioProy;
        this.descProy = descProy;
        this.imgProy = imgProy;
    }
    
    
}
