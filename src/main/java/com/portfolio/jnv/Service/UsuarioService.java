/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.jnv.Service;

import com.portfolio.jnv.Entity.Usuario;
import com.portfolio.jnv.Exception.UserNotFoundException;
import com.portfolio.jnv.Repository.UsuarioRepo;
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
public class UsuarioService {
    private final UsuarioRepo usuarioRepo;
    
    @Autowired
    public UsuarioService(UsuarioRepo usuarioRepo) {
        this.usuarioRepo = usuarioRepo;
    }
    public Usuario addUsuario(Usuario usuario){
        return usuarioRepo.save(usuario);
    }
    public List<Usuario> buscarUsuario(Usuario usuario){
        return usuarioRepo.findAll();
    }
    public Usuario editUsuario (Usuario usuario){
        return usuarioRepo.save(usuario);
    }
    public void delUsuario (Long id){
        usuarioRepo.deleteById(id);
    }
    public Usuario BuscarUsuarioPorID (Long id){
        return usuarioRepo.findById(id).orElseThrow(()-> new UserNotFoundException("No se encuentra el usuario"));
    }
}
