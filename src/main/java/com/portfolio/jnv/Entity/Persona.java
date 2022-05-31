/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.jnv.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

/**
 *
 * @author Jonatan
 */
@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @javax.persistence.Id
    private Long id;
    
    @NotNull
    @Size(min = 1 , max = 50 , message = "La entrada no cumple con las condiciones")
    private String nombre;
    
    @NotNull
    @Size(min = 1 , max = 50 , message = "La entrada no cumple con las condiciones")
    private String apellido;
    
    @Size(min = 1 , max = 50 , message = "La entrada no cumple con las condiciones")
    private String img;
    
}
