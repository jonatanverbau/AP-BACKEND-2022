/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.jnv.Service;

import com.portfolio.jnv.Entity.Skills;
import com.portfolio.jnv.Repository.SkillsRepo;
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
public class SkillsService {
    private final SkillsRepo skillsRepo;
    
    @Autowired
    public SkillsService(SkillsRepo skillsRepo) {
        this.skillsRepo = skillsRepo;
    }
    public Skills addSkills(Skills skills){
        return skillsRepo.save(skills);
    }
    public List<Skills> buscarSkills(Skills skills){
        return skillsRepo.findAll();
    }
    public Skills editSkills (Skills skills){
        return skillsRepo.save(skills);
    }
    public void delSkills (Long id){
        skillsRepo.deleteById(id);
    }
}
