package com.usta.biblioteca.models.services;

import  java.util.List;

import com.usta.biblioteca.entities.PrestamoEntity;

public interface PrestamoService {
  public List<PrestamoEntity> findAll();
  public void save(PrestamoEntity prestamo);
  public PrestamoEntity findById(Long id);
  public void deleteById(Long id);
  public PrestamoEntity updatePrestamoEntity(PrestamoEntity prestamo); // nosotros agregamos este método
}
