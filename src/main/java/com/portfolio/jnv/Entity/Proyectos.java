/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.jnv.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Jonatan
 */

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

    public Long getIdProy() {
        return idProy;
    }

    public void setIdProy(Long idProy) {
        this.idProy = idProy;
    }

    public String getNombreProy() {
        return nombreProy;
    }

    public void setNombreProy(String nombreProy) {
        this.nombreProy = nombreProy;
    }

    public int getAnioProy() {
        return anioProy;
    }

    public void setAnioProy(int anioProy) {
        this.anioProy = anioProy;
    }

    public String getDescProy() {
        return descProy;
    }

    public void setDescProy(String descProy) {
        this.descProy = descProy;
    }

    public String getImgProy() {
        return imgProy;
    }

    public void setImgProy(String imgProy) {
        this.imgProy = imgProy;
    }
    
    
}
