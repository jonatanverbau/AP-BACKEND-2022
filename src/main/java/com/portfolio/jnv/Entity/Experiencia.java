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

    public Long getIdExp() {
        return idExp;
    }

    public void setIdExp(Long idExp) {
        this.idExp = idExp;
    }

    public String getNombreExp() {
        return nombreExp;
    }

    public void setNombreExp(String nombreExp) {
        this.nombreExp = nombreExp;
    }

    public int getAnioInExp() {
        return anioInExp;
    }

    public void setAnioInExp(int anioInExp) {
        this.anioInExp = anioInExp;
    }

    public int getAnioFinExp() {
        return anioFinExp;
    }

    public void setAnioFinExp(int anioFinExp) {
        this.anioFinExp = anioFinExp;
    }

    public String getDescExp() {
        return descExp;
    }

    public void setDescExp(String descExp) {
        this.descExp = descExp;
    }

    public String getImgExp() {
        return imgExp;
    }

    public void setImgExp(String imgExp) {
        this.imgExp = imgExp;
    }
    
    
}
