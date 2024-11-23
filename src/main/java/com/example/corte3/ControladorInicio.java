
package com.example.corte3;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Administrador
 */
@RestController
@Slf4j
public class ControladorInicio {
    
    @GetMapping("/")
    
    public String inicio (){
        log.info("coroncoro se murio tu maeeeeee'");
        return "este es un mensaje de ";
        
    }
    
    
}
