/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.jnv.Interface;

import com.portfolio.jnv.Entity.Persona;
import java.util.List;


/**
 *
 * @author Jonatan
 */
public interface IPersonaService {
    // traer personas
    public List<Persona> getPersona();
    
    //guardar una persona
    public void savePersona(Persona persona);
    
    //eliminar una persona
    public void deletePersona(Long id);
    
    //buscar una persona
    public Persona findPersona(Long id);
}
