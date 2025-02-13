package com.center.stock.estoque_online.usuario.application.api;

import java.util.List;

import java.util.UUID;

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

    @Override
    public List<UsuarioListResponse> getTodosUsuarios() {
        log.info("[Inicia] UsuarioController - getTodosUsuarios");
        List<UsuarioListResponse> usuarios = usuarioService.buscaTodosUsuarios();
        log.info("[Finaliza] UsuarioController - getTodosUsuarios");
        return usuarios;
    }
  
    @Override
    public UsuarioDetalhadoResponse getUsuarioAtravezId(UUID idUsuario) {
        log.info("[Inicia] UsuarioController - getUsuarioAtravezId");
        log.info("[idUsuario] {}", idUsuario);
        UsuarioDetalhadoResponse usuarioDetalhado = usuarioService.buscaUsuarioAtravezId(idUsuario);
        log.info("[Finaliza] UsuarioController - getUsuarioAtravezId");
        return usuarioDetalhado;
    }

}
