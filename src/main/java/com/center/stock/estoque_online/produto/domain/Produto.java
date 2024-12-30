package com.center.stock.estoque_online.produto.domain;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
@Table
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid", name = "idProduto", updatable = false, unique = true, nullable = false)
    private UUID idProduto;
    @NotBlank
    private String nomeProduto;
    @NotBlank
    private Integer quantidadeProduto;
    @NotBlank
    private String descricaoProduto;
    @NotBlank
    private String modelo;
    @Enumerated(EnumType.STRING)
    private EstadoDeConservacao estadoDeConservacao;
    @NotBlank
    @Enumerated(EnumType.STRING)
    private Unidade unidade;

    public void verificaQuantidadeProduto() {
        if(quantidadeProduto == null || quantidadeProduto == 0) {
            quantidadeProduto = Integer.valueOf(0);
            System.out.println("Indisponível");
        }
    }

}
