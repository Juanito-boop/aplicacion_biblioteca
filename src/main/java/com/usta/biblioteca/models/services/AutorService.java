package com.usta.biblioteca.models.services;

import java.util.List;

import com.usta.biblioteca.entities.AutorEntity;

public interface AutorService {
  public List<AutorEntity> findAll();
  public void save(AutorEntity autor);
  public AutorEntity findById(Long id);
  public void deleteById(Long id);
  public AutorEntity updateAuthorEntity(AutorEntity autor); // nosotros agregamos este método
  public void changeState(Long idAutor);
  public AutorEntity viewDetail(long id);
}
