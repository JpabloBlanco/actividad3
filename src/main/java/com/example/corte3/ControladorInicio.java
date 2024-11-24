
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
        u1.setPassword("Abcd");
        u1.setNombre("Juan Pablo");
        u1.setApellidos("Blanco VasquesZ");
        u1.setRol("admin");
        u1.setEmail("Juanp@gmail.com");
        u1.setTelefono("777");
        u1.setEstado("activo");
        modelo.addAttribute("alguien", u1);
        
        Usuario u2 = new Usuario();
        u2.setCedula("5678 ");
        u2.setPassword("Efgh");
        u2.setNombre("Cesar manuel");
        u2.setApellidos("Blanco Vasquez");
        u2.setRol("user");
        u2.setEmail("CesarM@gmail.com");
        u2.setTelefono("3131");
        u2.setEstado("activo");
        
        Usuario u3 = new Usuario();
        u3.setCedula("0000");
        u3.setPassword("none");
        u3.setNombre("No bo");
        u3.setApellidos("dy");
        u3.setRol("user");
        u3.setEmail("nothing@gmail.com");
        u3.setTelefono("00000");
        u3.setEstado("activo");
        
        List <Usuario> listasUsuarios = Arrays.asList(u2,u3);
        modelo.addAttribute("usuarios",listasUsuarios );
        log.info("coroncoro se murio tu maeeeeee");
        return "index";
        
    }
    
    
}
