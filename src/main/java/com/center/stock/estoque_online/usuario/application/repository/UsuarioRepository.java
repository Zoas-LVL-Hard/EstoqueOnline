package com.center.stock.estoque_online.usuario.application.repository;

import java.util.UUID;

import com.center.stock.estoque_online.usuario.domain.Usuario;

/**
 * Interface que recebe dados de CRUD do Service.
 */
public interface UsuarioRepository {

    Usuario salva(Usuario usuario);

    Usuario buscaPorId(UUID idUsuario);

}
