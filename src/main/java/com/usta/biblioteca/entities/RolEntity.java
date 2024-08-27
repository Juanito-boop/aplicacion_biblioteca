package com.usta.biblioteca.entities;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "roles")
public class RolEntity implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_rol")
  private long idRol;

  @NotNull
  @Size(min = 1, max = 20)
  @Column(name = "rol", length = 20, nullable = false)
  private String rol;

  public RolEntity(String rol) {
    super();
    this.rol = rol;
  }

  public RolEntity() {
  }
}
