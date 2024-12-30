package com.center.stock.estoque_online.usuario.application.api;

import org.springframework.stereotype.Controller;

import com.center.stock.estoque_online.usuario.application.service.UsuarioService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Controller
@RequiredArgsConstructor
@Log4j2
public class UsuarioController implements UsuarioAPI {

    private final UsuarioService usuarioService;

    @Override
    public UsuarioResponse postNovoUsuario(@Valid UsuarioRequest usuarioRequest) {
        log.info("[Inicia] UsuarioController - postNovoUsuario");
        UsuarioResponse usuarioCriado = usuarioService.criaUsuario(usuarioRequest);
        log.info("[Finaliza] UsuarioController - postNovoUsuario");
        return usuarioCriado;
    }

}
