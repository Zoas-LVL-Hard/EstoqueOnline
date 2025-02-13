package com.center.stock.estoque_online.usuario.infra;

import java.util.List;

import java.util.UUID;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import com.center.stock.estoque_online.handler.APIException;
import com.center.stock.estoque_online.usuario.application.repository.UsuarioRepository;
import com.center.stock.estoque_online.usuario.domain.Usuario;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@RequiredArgsConstructor
@Log4j2
public class UsuarioInfraRepository implements UsuarioRepository {

    private final UsuarioSpringDataJPARepository usuarioSpringDataJPARepository;

    @Override
    public Usuario salva(Usuario usuario) {
        log.info("[Inicia] UsuarioInfraRepository - salva");
        try {
            usuarioSpringDataJPARepository.save(usuario);
        } catch (DataIntegrityViolationException e) {
            throw APIException.build(HttpStatus.BAD_REQUEST, "CPF já cadastrado");
        }
        log.info("[Finaliza] UsuarioInfraRepository - salva");
        return usuario;
    }

    @Override
    public List<Usuario> buscaTodosUsuarios() {
        log.info("[Inicia] UsuarioInfraRepository - buscaTodosUsuarios");
        List<Usuario> usuarios = usuarioSpringDataJPARepository.findAll();
        log.info("[Finaliza] UsuarioInfraRepository - buscaTodosUsuarios");
        return usuarios;
    }

    @Override
    public Usuario buscaPorId(UUID idUsuario) {
        log.info("[Inicia] UsuarioInfraRepository - buscaPorId");
        Usuario usuario = usuarioSpringDataJPARepository
                .findById(idUsuario)
                .orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Usuário não encontrado"));
        log.info("[Finaliza] UsuarioInfraRepository - buscaPorId");
        return usuario;

    }

}
