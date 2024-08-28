package com.usta.biblioteca.models.DAO;

import org.springframework.data.repository.CrudRepository;

import com.usta.biblioteca.entities.PrestamoEntity;

public interface PrestamoDAO extends CrudRepository<PrestamoEntity, Long> {
}
