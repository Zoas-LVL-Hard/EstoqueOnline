package com.center.stock.estoque_online.usuario.application.repository;

import com.center.stock.estoque_online.usuario.domain.Usuario;

/**
 * Interface que recebe dados de CRUD do Service.
 */
public interface UsuarioRepository {

    Usuario salva(Usuario usuario);

}
