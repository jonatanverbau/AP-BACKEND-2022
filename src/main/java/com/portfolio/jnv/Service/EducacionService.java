/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.jnv.Service;

import com.portfolio.jnv.Entity.Educacion;
import com.portfolio.jnv.Repository.EducacionRepo;
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
public class EducacionService {
    private final EducacionRepo educacionRepo;
    
    @Autowired
    public EducacionService(EducacionRepo educacionRepo) {
        this.educacionRepo = educacionRepo;
    }
    public Educacion addEducacion(Educacion educacion){
        return educacionRepo.save(educacion);
    }
    public List<Educacion> buscarEducacion(Educacion educacion){
        return educacionRepo.findAll();
    }
    public Educacion editEducation (Educacion educacion){
        return educacionRepo.save(educacion);
    }
    public void delEducacion (Long id){
        educacionRepo.deleteById(id);
    }
}
