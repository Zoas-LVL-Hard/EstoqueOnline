package com.center.stock.estoque_online.usuario.domain;

import java.util.UUID;

//import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.br.CPF;

import com.center.stock.estoque_online.usuario.application.api.UsuarioRequest;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Entity
@Data
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(columnDefinition = "VARCHAR(36)", name = "id_usuario", updatable = false, unique = true, nullable = false)
    private UUID idUsuario;

    @CPF(message = "CPF inválido!")
    @Column(unique = true, nullable = false)
    private String cpf;

    @NotBlank
    private String nomeCompleto;

    @NotBlank
    private String endereco;


    public Usuario(UsuarioRequest usuarioRequest) {
        this.cpf = usuarioRequest.getCpf();
        this.nomeCompleto = usuarioRequest.getNomeCompleto();
        this.endereco = usuarioRequest.getEndereco();
    }
}
