package com.center.stock.estoque_online.usuario.application.api;

import java.util.List;
import java.util.stream.Collectors;

import com.center.stock.estoque_online.usuario.domain.Usuario;

import lombok.Value;

@Value
public class UsuarioListResponse {
    private String nomeCompleto;

    public UsuarioListResponse(Usuario usuario) {
        this.nomeCompleto = usuario.getNomeCompleto();
    }

    /**
     * Converte uma lista de Usuario em uma lista de UsuarioListResponse por meio de
     * um stream. Isso significa que, para cada objeto Usuario no stream, será
     * criado um novo objeto UsuarioListResponse usando o
     * construtor(UsuarioListResponse::new) que recebe um
     * objeto Usuario como argumento.
     * A operação collect transforma o stream de volta em uma coleção. Nesse caso, o
     * coletor Collectors.toList() é usado para criar uma lista.
     * 
     * @param usuarios
     * @return
     */
    public static List<UsuarioListResponse> converte(List<Usuario> usuarios) {
        return usuarios.stream()
                .map(UsuarioListResponse::new)
                .collect(Collectors.toList());
    }
}
