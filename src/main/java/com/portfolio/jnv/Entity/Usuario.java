/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.jnv.Entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


/**
 *
 * @author Jonatan
 */
@Entity
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long idUsuario;
    private String nombreUsuario;
    private String apellidoUsuario;
    private String tituloUsuario;
    private String descUsuario;
    private String imgUsuario;
    
    @OneToMany(fetch = FetchType.LAZY , mappedBy = "idExp")
    private List<Experiencia> experienciaList;
       
    @OneToMany(fetch = FetchType.LAZY , mappedBy = "idEdu")
    private List<Educacion> educacionList;
            
    @OneToMany(fetch = FetchType.LAZY , mappedBy = "idSkill")
    private List<Skills> skillsList;
                
    @OneToMany(fetch = FetchType.LAZY , mappedBy = "idProy")
    private List<Proyectos> proyectosList;

    public Usuario() {
    }

    public Usuario(Long idUsuario, String nombreUsuario, String apellidoUsuario, String tituloUsuario, String descUsuario, String imgUsuario) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.tituloUsuario = tituloUsuario;
        this.descUsuario = descUsuario;
        this.imgUsuario = imgUsuario;
    } 

    public Long getIdUsuario() {
        return idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public String getTituloUsuario() {
        return tituloUsuario;
    }

    public String getDescUsuario() {
        return descUsuario;
    }

    public String getImgUsuario() {
        return imgUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    public void setTituloUsuario(String tituloUsuario) {
        this.tituloUsuario = tituloUsuario;
    }

    public void setDescUsuario(String descUsuario) {
        this.descUsuario = descUsuario;
    }

    public void setImgUsuario(String imgUsuario) {
        this.imgUsuario = imgUsuario;
    }
    
}
