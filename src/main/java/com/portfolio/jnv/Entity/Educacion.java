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

    public Long getIdEdu() {
        return idEdu;
    }

    public void setIdEdu(Long idEdu) {
        this.idEdu = idEdu;
    }

    public String getNombreEdu() {
        return nombreEdu;
    }

    public void setNombreEdu(String nombreEdu) {
        this.nombreEdu = nombreEdu;
    }

    public int getAnioInEdu() {
        return anioInEdu;
    }

    public void setAnioInEdu(int anioInEdu) {
        this.anioInEdu = anioInEdu;
    }

    public int getAnioFinEdu() {
        return anioFinEdu;
    }

    public void setAnioFinEdu(int anioFinEdu) {
        this.anioFinEdu = anioFinEdu;
    }

    public String getDescEdu() {
        return descEdu;
    }

    public void setDescEdu(String descEdu) {
        this.descEdu = descEdu;
    }

    public String getImgEdu() {
        return imgEdu;
    }

    public void setImgEdu(String imgEdu) {
        this.imgEdu = imgEdu;
    }
    
}
