/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.jnv.Service;

import com.portfolio.jnv.Entity.Experiencia;
import com.portfolio.jnv.Repository.ExperienciaRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Jonatan
 */
@Service
@Transactional
public class ExperienciaService {
    private final ExperienciaRepo experienciaRepo;
    
    @Autowired
    public ExperienciaService(ExperienciaRepo experienciaRepo) {
        this.experienciaRepo = experienciaRepo;
    }
    public Experiencia addExperiencia(Experiencia experiencia){
        return experienciaRepo.save(experiencia);
    }
    public List<Experiencia> buscarExperiencia(Experiencia experiencia){
        return experienciaRepo.findAll();
    }
    public Experiencia editExperiencia (Experiencia experiencia){
        return experienciaRepo.save(experiencia);
    }
    public void delExperiencia (Long id){
        experienciaRepo.deleteById(id);
    }
}
