package com.bootcamp.morse.Controllers;

import com.bootcamp.morse.Entities.CodigoMorse;
import com.bootcamp.morse.Entities.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CodeController {

    @GetMapping(path = "/code/{morse}")
    public Response decodificarFrase(@PathVariable String morse) {
        return new Response("OK", new CodigoMorse(morse), "La decodificacion ha sido exitosa!") ;
    }
}
