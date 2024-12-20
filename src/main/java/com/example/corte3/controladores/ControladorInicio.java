package com.example.corte3.controladores;

import com.blade.validator.annotation.Valid;
import com.example.corte3.modelo.Usuario;
import com.example.corte3.servicio.IUsuarioServicio;
import java.util.List;
import lombok.extern.slf4j.Slf4j;   
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;


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
    
    @GetMapping("/agregar")
    public String agregar (Usuario usuario){
        return "modificar";
    }
    
    @PostMapping("/guardar")
    public String guardar (@Valid Usuario usuario, Errors errores){
        if (errores.hasErrors()){
            return "modificar";
        }
        userServicio.guardar(usuario);
        return "redirect:/";
    }
    
    @GetMapping("/editar/{id}")
    public String editar (Usuario usuario, Model modelo){
        log.info("invocando el metodo editar" );
        usuario = userServicio.buscar(usuario);
        modelo.addAttribute("usuario", usuario);
        
        return "modificar";
    }
    
    @GetMapping("/eliminar/{id}")
    public String eliminar (Usuario usuario, Model modelo){
        userServicio.eliminar(usuario);
        return "redirect:/";
    }
    
}
