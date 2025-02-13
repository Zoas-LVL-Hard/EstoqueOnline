package com.center.stock.estoque_online.usuario.application.api;

import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

import java.util.List;

import java.util.UUID;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;




/**
 * Interface que representa a API de Usuário
 */
@RestController
@RequestMapping("/usuario")
public interface UsuarioAPI {
    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    UsuarioResponse postNovoUsuario(@Valid @RequestBody UsuarioRequest usuarioRequest);

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    List<UsuarioListResponse> getTodosUsuarios();
    
    @GetMapping("/{idUsuario}")
    @ResponseStatus(HttpStatus.OK)
    UsuarioDetalhadoResponse getUsuarioAtravezId (@PathVariable UUID idUsuario);
    
    
}
