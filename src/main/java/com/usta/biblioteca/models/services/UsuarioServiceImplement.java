package com.usta.biblioteca.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.usta.biblioteca.entities.UsuarioEntity;
import com.usta.biblioteca.models.DAO.UsuarioDAO;

@Service
public class UsuarioServiceImplement implements UsuarioService {
  @Autowired
  private UsuarioDAO usuarioDAO;

  @Override
  @Transactional
  public List<UsuarioEntity> findAll() {
    return (List<UsuarioEntity>) usuarioDAO.findAll();
  }

  @Override
  @Transactional
  public void save(UsuarioEntity usuario) {
    usuarioDAO.save(usuario);
  }

  @Override
  @Transactional
  public UsuarioEntity findById(Long id) {
    return usuarioDAO.findById(id).orElse(null);
  }

  @Override
  @Transactional
  public void deleteById(Long id) {
    usuarioDAO.deleteById(id);
  }

  @Override
  @Transactional
  public UsuarioEntity updateUsuarioEntity(UsuarioEntity usuario) {
    return usuarioDAO.save(usuario);
  }

  @Override
  @Transactional
  public void changeState(Long idUsuario) {
    usuarioDAO.updateUserState(idUsuario);
  }

  @Override
  @Transactional
  public UsuarioEntity findByEmail(String email) {
    return usuarioDAO.getUserByEmail(email);
  }
}
