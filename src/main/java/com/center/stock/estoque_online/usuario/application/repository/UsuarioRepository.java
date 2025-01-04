package com.center.stock.estoque_online.usuario.application.repository;

import java.util.UUID;

import com.center.stock.estoque_online.usuario.domain.Usuario;

public interface UsuarioRepository {

    Usuario salva(Usuario usuario);

    Usuario buscaPorId(UUID idUsuario);

}
