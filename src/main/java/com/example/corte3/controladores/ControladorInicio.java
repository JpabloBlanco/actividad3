
package com.example.corte3.controladores;


import com.example.corte3.modelo.Usuario;
import com.example.corte3.servicio.IUsuarioServicio;
import java.util.List;
import lombok.extern.slf4j.Slf4j;   
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;


/**
 *
 * @author Juan Pablo Blanco
 */

@Slf4j
@Controller
public class ControladorInicio {
    
    @Autowired
    IUsuarioServicio userServicio;
    @GetMapping("/")
    public String inicio(Model modelo){
        
        
        List<Usuario> listaUsuario = (List<Usuario>) userServicio.listarUsuarios();
        modelo.addAttribute("usuarios", listaUsuario);
        log.info("olvidalaaaaaaaaaaaaaa");
        return "index";
    }
    
}
