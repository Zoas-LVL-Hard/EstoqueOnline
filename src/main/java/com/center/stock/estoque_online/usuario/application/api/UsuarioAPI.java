package com.center.stock.estoque_online.usuario.application.api;

import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;


@RestController
@RequestMapping("/usuario")
public interface UsuarioAPI {
    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    UsuarioResponse postNovoUsuario(@Valid @RequestBody UsuarioRequest usuarioRequest);
    
}
