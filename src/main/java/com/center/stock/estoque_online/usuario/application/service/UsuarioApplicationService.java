package com.center.stock.estoque_online.usuario.application.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.center.stock.estoque_online.usuario.application.api.UsuarioDetalhadoResponse;
import com.center.stock.estoque_online.usuario.application.api.UsuarioRequest;
import com.center.stock.estoque_online.usuario.application.api.UsuarioResponse;
import com.center.stock.estoque_online.usuario.application.repository.UsuarioRepository;
import com.center.stock.estoque_online.usuario.domain.Usuario;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@RequiredArgsConstructor
@Log4j2
public class UsuarioApplicationService implements UsuarioService {

    private final UsuarioRepository usuarioRepository;

    @Override
    public UsuarioResponse criaUsuario(UsuarioRequest usuarioRequest) {
        log.info("[Inicia] UsuarioApplicationService - criaUsuario");
        Usuario usuario = usuarioRepository.salva(new Usuario(usuarioRequest));
        log.info("[Finaliza] UsuarioApplicationService - criaUsuario");
        return UsuarioResponse.builder()
                .idUsuario(usuario.getIdUsuario())
                .build();
    }

    @Override
    public UsuarioDetalhadoResponse buscaUsuarioAtravezId(UUID idUsuario) {
        log.info("[Inicia] UsuarioApplicationService - buscaUsuarioAtravezId");
        Usuario usuario = usuarioRepository.buscaPorId(idUsuario);
        log.info("[Finaliza] UsuarioApplicationService - buscaUsuarioAtravezId");
        return new UsuarioDetalhadoResponse(usuario);

    }

}
