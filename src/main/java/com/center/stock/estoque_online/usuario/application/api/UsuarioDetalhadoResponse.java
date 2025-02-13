package com.center.stock.estoque_online.usuario.application.api;

import java.util.UUID;

import com.center.stock.estoque_online.usuario.domain.Usuario;

import lombok.Value;

@Value
public class UsuarioDetalhadoResponse {
    private UUID idUsuario;
    private String cpf;
    private String nomeCompleto;
    private String endereco;
    private boolean aceitaTermos;

    public UsuarioDetalhadoResponse(Usuario usuario) {
        this.idUsuario = usuario.getIdUsuario();
        this.cpf = usuario.getCpf();
        this.nomeCompleto = usuario.getNomeCompleto();
        this.endereco = usuario.getEndereco();
        this.aceitaTermos = usuario.isAceitaTermos();
    }
}
