package com.usta.biblioteca.models.services;

import java.util.List;

import com.usta.biblioteca.entities.RolEntity;

public interface RolService {
  public List<RolEntity> findAll();
  public void save(RolEntity rol);
  public RolEntity findById(Long id);
  public void deleteById(Long id);
  public RolEntity updateRolEntity(RolEntity rol); // nosotros agregamos este método
}
