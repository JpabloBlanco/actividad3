
package com.example.corte3.modelo;

import lombok.Data;

/**
 *
 * @author Juan Pablo Blanco :) 
 */
@Data
public class Usuario {
    
    private String cedula;
    private String password;
    private String nombre;
    private String apellidos;
    private String rol;
    private String email;
    private String telefono;
    private String estado;
    
    
}
