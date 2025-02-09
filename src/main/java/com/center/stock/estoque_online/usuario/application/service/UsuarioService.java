package com.center.stock.estoque_online.usuario.application.service;

import java.util.List;

import com.center.stock.estoque_online.usuario.application.api.UsuarioListResponse;
import com.center.stock.estoque_online.usuario.application.api.UsuarioRequest;
import com.center.stock.estoque_online.usuario.application.api.UsuarioResponse;

public interface UsuarioService {

    UsuarioResponse criaUsuario(UsuarioRequest usuarioRequest);

    List<UsuarioListResponse> buscaTodosUsuarios();

}
