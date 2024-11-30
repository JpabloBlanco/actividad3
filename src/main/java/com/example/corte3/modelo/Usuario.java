
package com.example.corte3.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

/**
 *
 * @author Juan Pablo Blanco :) 
 */

@Entity
@Table(name = "usuarios")
@Data
public class Usuario implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    private int id;
    private String cedula;
    private String password;
    private String nombre;
    private String apellidos;
    private String rol;
    private String email;
    private String telefono;
    private String estado;
    
    @CreationTimestamp 
    @Column(name = "fecha_registro", nullable = false, updatable = false)
    private LocalDateTime fecha_registro;
   
    
}
