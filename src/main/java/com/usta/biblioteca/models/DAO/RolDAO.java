package com.usta.biblioteca.models.DAO;

import org.springframework.data.repository.CrudRepository;

import com.usta.biblioteca.entities.RolEntity;

public interface RolDAO extends CrudRepository<RolEntity, Long> {
    
}
