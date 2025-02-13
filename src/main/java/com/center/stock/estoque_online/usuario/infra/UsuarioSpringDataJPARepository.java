package com.center.stock.estoque_online.usuario.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.center.stock.estoque_online.usuario.domain.Usuario;

public interface UsuarioSpringDataJPARepository extends JpaRepository<Usuario, UUID> {

}
