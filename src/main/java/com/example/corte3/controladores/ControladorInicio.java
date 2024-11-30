
package com.example.corte3.controladores;

import com.example.corte3.dao.IUsuarioCrud;
import com.example.corte3.modelo.Usuario;
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
    IUsuarioCrud crudUsuario;
    @GetMapping("/")
    public String inicio(Model modelo){
        
        
        List<Usuario> listaUsuario = (List<Usuario>) crudUsuario.findAll();
        modelo.addAttribute("usuarios", listaUsuario);
        log.info("olvidalaaaaaaaaaaaaaa");
        return "index";
    }
    
}
