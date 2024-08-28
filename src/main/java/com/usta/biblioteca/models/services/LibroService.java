package com.usta.biblioteca.models.services;

import java.util.List;

import com.usta.biblioteca.entities.LibroEntity;

public interface LibroService {
  public List<LibroEntity> findAll();
  public void save(LibroEntity libro);
  public LibroEntity findById(Long id);
  public void deleteById(Long id);
  public LibroEntity updateLibroEntity(LibroEntity libro); // nosotros agregamos este método
  public void updateBookState(Long idLibro);
  public LibroEntity getLibroDetail(long id);
}
