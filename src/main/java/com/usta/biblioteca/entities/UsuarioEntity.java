package com.usta.biblioteca.entities;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "usuarios")
public class UsuarioEntity implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_usuario")
  private long idUsuario;

  @NotNull
  @Size(min = 1, max = 40)
  @Column(name = "nombre", length = 40, nullable = false)
  private String nombre;

  @NotNull
  @Size(min = 1, max = 40)
  @Column(name = "apellido", length = 40, nullable = false)
  private String apellido;

  @NotNull
  @Size(min = 1, max = 100)
  @Column(name = "email", length = 100, nullable = false)
  private String email;

  @Size(max = 15)
  @Column(name = "telefono", length = 15)
  private String telefono;

  @NotNull
  @Size(min = 8, max = 12)
  @Column(name = "contrasena", length = 12, nullable = false)
  private String contrasena;

  @NotNull
  @Column(name = "estado_usuario", columnDefinition = "boolean", nullable = false)
  private Boolean estadoUsuario;

  @NotNull
  @JoinColumn(name = "rol_id_rol", referencedColumnName = "id_rol")
  @ManyToOne(fetch = FetchType.LAZY)
  @OnDelete(action = OnDeleteAction.CASCADE)
  private RolEntity rol;
}
