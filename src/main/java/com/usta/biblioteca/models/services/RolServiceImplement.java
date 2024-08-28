package com.usta.biblioteca.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.usta.biblioteca.entities.RolEntity;
import com.usta.biblioteca.models.DAO.RolDAO;

@Service
public class RolServiceImplement implements RolService {
  
  @Autowired
  private RolDAO rolDAO;

  @Override
  @Transactional
  public List<RolEntity> findAll() {
    return (List<RolEntity>) rolDAO.findAll();
  }

  @Override
  @Transactional
  public void save(RolEntity rol) {
    rolDAO.save(rol);
  }

  @Override
  @Transactional
  public RolEntity findById(Long id) {
    return rolDAO.findById(id).orElse(null);
  }

  @Override
  @Transactional
  public void deleteById(Long id) {
    rolDAO.deleteById(id);
  }

  @Override
  @Transactional
  public RolEntity updateRolEntity(RolEntity rol) {
    return rolDAO.save(rol);
  }
}
