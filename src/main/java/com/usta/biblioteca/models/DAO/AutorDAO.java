package com.usta.biblioteca.models.DAO;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.usta.biblioteca.entities.AutorEntity;

public interface AutorDAO extends CrudRepository<AutorEntity, Long> {
  @Transactional
  @Modifying
  @Query("UPDATE AutorEntity a SET a.estadoAutor = false WHERE a.idAutor = ?1")
  public void changeState(Long idAutor);

  @Transactional
  @Query("SELECT a FROM AutorEntity a WHERE a.idAutor = ?1")
  public AutorEntity vewDetail(Long idAutor);
}
