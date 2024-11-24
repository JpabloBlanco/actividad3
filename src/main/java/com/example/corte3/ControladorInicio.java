
package com.example.corte3;

import com.example.corte3.modelo.Usuario;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Administrador
 */
@Controller
@Slf4j
public class ControladorInicio {
    
    @Value ("${index.mensaje}")
    String dato;
    @GetMapping("/")
    
    public String inicio (Model modelo){
        String mensaje = "Saludos desde Spring MVC";
        modelo.addAttribute("mensaje", mensaje);
        modelo.addAttribute("dato", dato);
        Usuario u = new Usuario();
        u.setCedula("1234 ");
        u.setClave("Abcd");
        u.setNombre("Juan Pablo Blanco");
        u.setEmail("Juanp@gmail.com");
        modelo.addAttribute("alguien", u);
        log.info("coroncoro se murio tu maeeeeee");
        return "index";
        
    }
    
    
}
