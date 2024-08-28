package com.usta.biblioteca.models.DAO;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.usta.biblioteca.entities.UsuarioEntity;

public interface UsuarioDAO extends CrudRepository<UsuarioEntity, Long> {
  @Transactional
  @Modifying
  @Query("UPDATE UsuarioEntity u SET u.estadoUsuario = false WHERE u.idUsuario = ?1")
  public void updateUserState(Long idUsuario);

  @Transactional
  @Query("SELECT u FROM UsuarioEntity u WHERE u.email = ?1")
  public UsuarioEntity getUserByEmail(String email);
}
