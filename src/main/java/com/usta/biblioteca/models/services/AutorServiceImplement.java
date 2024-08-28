package com.usta.biblioteca.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.usta.biblioteca.entities.AutorEntity;
import com.usta.biblioteca.models.DAO.AutorDAO;

@Service
public class AutorServiceImplement implements AutorService {
  @Autowired
  private AutorDAO autorDAO;

  @Override
  @Transactional
  public List<AutorEntity> findAll() {
    return (List<AutorEntity>) autorDAO.findAll();
  }

  @Override
  @Transactional
  public void save(AutorEntity autor) {
    autorDAO.save(autor);
  }

  @Override
  @Transactional
  public AutorEntity findById(Long id) {
    return autorDAO.findById(id).orElse(null);
  }

  @Override
  @Transactional
  public void deleteById(Long id) {
    autorDAO.deleteById(id);
  }

  @Override
  @Transactional
  public AutorEntity updateAuthorEntity(AutorEntity autor) {
    return autorDAO.save(autor);
  }

  @Override
  @Transactional
  public void changeState(Long idAutor) {
    autorDAO.changeState(idAutor);
  }

  @Override
  @Transactional
  public AutorEntity viewDetail(long id) {
    return autorDAO.vewDetail(id);
  }
}
