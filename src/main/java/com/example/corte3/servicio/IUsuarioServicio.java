
package com.example.corte3.servicio;

import com.example.corte3.modelo.Usuario;
import java.util.List;

/**
 *
 * @author Administrador
 */
public interface IUsuarioServicio {
    
        public  List<Usuario> listarUsuarios();
        
        public void guardar (Usuario user);
        
        public void eliminar (Usuario user);
        
        public Usuario buscar (Usuario user);
}
