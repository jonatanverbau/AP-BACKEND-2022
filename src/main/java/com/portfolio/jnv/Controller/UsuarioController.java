/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.jnv.Controller;

import com.portfolio.jnv.Entity.Usuario;
import com.portfolio.jnv.Service.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Jonatan
 */
@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }
    @GetMapping("id/{id}")
    public ResponseEntity<Usuario> obtenerUsuario(@PathVariable("id")Long id){
        Usuario usuario =usuarioService.BuscarUsuarioPorID(id);
        return new ResponseEntity<>(usuario, HttpStatus.OK);
    }
    @PutMapping("/update")
    public ResponseEntity<Usuario> editarUsuario(@RequestBody Usuario usuario){
        Usuario updatedUsuario=usuarioService.editUsuario(usuario);
        return new ResponseEntity<>(updatedUsuario, HttpStatus.OK);
    }
    
}
