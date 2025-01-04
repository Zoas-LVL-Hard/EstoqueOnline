package com.center.stock.estoque_online.usuario.application.service;

import java.util.UUID;

import com.center.stock.estoque_online.usuario.application.api.UsuarioDetalhadoResponse;
import com.center.stock.estoque_online.usuario.application.api.UsuarioRequest;
import com.center.stock.estoque_online.usuario.application.api.UsuarioResponse;

public interface UsuarioService {

    UsuarioResponse criaUsuario(UsuarioRequest usuarioRequest);

    UsuarioDetalhadoResponse buscaUsuarioAtravezId(UUID idUsuario);

}
