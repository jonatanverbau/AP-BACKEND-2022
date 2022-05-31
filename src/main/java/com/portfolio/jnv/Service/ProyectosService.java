/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.jnv.Service;

import com.portfolio.jnv.Entity.Proyectos;
import com.portfolio.jnv.Repository.ProyectosRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Jonatan
 */
public class ProyectosService {
    private final ProyectosRepo proyectosRepo;
    
    @Autowired
    public ProyectosService(ProyectosRepo proyectosRepo) {
        this.proyectosRepo = proyectosRepo;
    }
    public Proyectos addProyectos(Proyectos proyectos){
        return proyectosRepo.save(proyectos);
    }
    public List<Proyectos> buscarProyectos(Proyectos proyectos){
        return proyectosRepo.findAll();
    }
    public Proyectos editProyectos (Proyectos proyectos){
        return proyectosRepo.save(proyectos);
    }
    public void delProyectos (Long id){
        proyectosRepo.deleteById(id);
    }
}
