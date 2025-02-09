package com.center.stock.estoque_online.usuario.application.api;

import java.util.UUID;

import lombok.Builder;
import lombok.Value;

/**
 * Classe responsável por representar a resposta da API de Usuário, o que retorna um UUID.
 */
@Value
@Builder
public class UsuarioResponse {
    private UUID idUsuario;
}
