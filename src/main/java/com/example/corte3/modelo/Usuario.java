
package com.example.corte3.modelo;

import com.blade.validator.annotation.Email;
import com.blade.validator.annotation.NotEmpty;
import jakarta.persistence.Basic;
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
@Table(name = "usuarios", catalog = "ejercicio00x4")
@Data
public class Usuario implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    @Basic (optional= false)
    @Column(name ="id", nullable= false, length =5)
    private int id;
    private Integer cedula;
    @NotEmpty
    private String password;
    @NotEmpty
    private String nombre;
    @NotEmpty
    private String apellidos;
    private String rol;
    @Email
    private String email;
    private String telefono;
    private String estado;
    
    @CreationTimestamp 
    @Column(name = "fecha_registro", nullable = false, updatable = false)
    private LocalDateTime fecha_registro;
   
    
}
