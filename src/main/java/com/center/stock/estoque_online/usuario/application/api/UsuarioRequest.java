package com.center.stock.estoque_online.usuario.application.api;

import org.hibernate.validator.constraints.br.CPF;

import jakarta.validation.constraints.NotBlank;
import lombok.Value;

@Value
public class UsuarioRequest {
    @CPF(message = "CPF inválido!")
    private String cpf;
    @NotBlank
    private String nomeCompleto;
    @NotBlank
    private String endereco;
}   
