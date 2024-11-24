
package com.example.corte3;

import com.example.corte3.modelo.Usuario;
import java.util.Arrays;
import java.util.List;
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
        
        Usuario u1 = new Usuario();
        u1.setCedula("1234 ");
        u1.setClave("Abcd");
        u1.setNombre("Juan Pablo Blanco");
        u1.setEmail("Juanp@gmail.com");
        modelo.addAttribute("alguien", u1);
        
        Usuario u2 = new Usuario();
        u2.setCedula("5678 ");
        u2.setClave("Efgh");
        u2.setNombre("Cesar manuel blanco");
        u2.setEmail("CesarM@gmail.com");
        
        Usuario u3 = new Usuario();
        u3.setCedula("0000");
        u3.setClave("none");
        u3.setNombre("No bo dy");
        u3.setEmail("nothing@gmail.com");
        
        List <Usuario> listasUsuarios = Arrays.asList(u2,u3);
        modelo.addAttribute("usuarios",listasUsuarios );
        log.info("coroncoro se murio tu maeeeeee");
        return "index";
        
    }
    
    
}
