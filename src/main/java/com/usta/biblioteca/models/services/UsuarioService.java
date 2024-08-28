package com.usta.biblioteca.models.services;

import java.util.List;

import com.usta.biblioteca.entities.UsuarioEntity;

public interface UsuarioService {
  public List<UsuarioEntity> findAll();
  public void save(UsuarioEntity usuario);
  public UsuarioEntity findById(Long id);
  public void deleteById(Long id);
  public UsuarioEntity updateUsuarioEntity(UsuarioEntity usuario); // nosotros agregamos este método
  public void changeState(Long idUsuario);
  public UsuarioEntity findByEmail(String email);
}
