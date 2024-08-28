package com.usta.biblioteca.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.usta.biblioteca.entities.LibroEntity;
import com.usta.biblioteca.models.DAO.LibroDAO;

@Service
public class LibroServiceImplement implements LibroService {
  @Autowired
  private LibroDAO libroDAO;

  @Override
  @Transactional
  public List<LibroEntity> findAll() {
    return (List<LibroEntity>) libroDAO.findAll();
  }

  @Override
  @Transactional
  public void save(LibroEntity libro) {
    libroDAO.save(libro);
  }

  @Override
  @Transactional
  public LibroEntity findById(Long id) {
    return libroDAO.findById(id).orElse(null);
  }

  @Override
  @Transactional
  public void deleteById(Long id) {
    libroDAO.deleteById(id);    
  }

  @Override
  @Transactional
  public LibroEntity updateLibroEntity(LibroEntity libro) {
    return libroDAO.save(libro);
    
  }

  @Override
  @Transactional
  public void updateBookState(Long idLibro) {
    libroDAO.updateBookState(idLibro);
  }

  @Override
  @Transactional
  public LibroEntity getLibroDetail(long id) {
    return libroDAO.getLibroDetail(id);
  }
}
