package com.usta.biblioteca.models.DAO;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.usta.biblioteca.entities.LibroEntity;

public interface LibroDAO extends CrudRepository<LibroEntity, Long> {
  @Transactional
  @Modifying
  @Query("UPDATE LibroEntity l SET l.estadoLibro = false WHERE l.idLibro = ?1")
  public void updateBookState(Long idLibro);

  @Transactional
  @Query("SELECT l FROM LibroEntity l WHERE l.idLibro = ?1")
  public LibroEntity getLibroDetail(Long idLibro);
}
