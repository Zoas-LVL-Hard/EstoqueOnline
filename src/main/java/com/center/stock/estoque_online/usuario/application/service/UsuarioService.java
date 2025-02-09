package com.center.stock.estoque_online.usuario.application.service;

import com.center.stock.estoque_online.usuario.application.api.UsuarioRequest;
import com.center.stock.estoque_online.usuario.application.api.UsuarioResponse;

public interface UsuarioService {

    UsuarioResponse criaUsuario(UsuarioRequest usuarioRequest);

}
