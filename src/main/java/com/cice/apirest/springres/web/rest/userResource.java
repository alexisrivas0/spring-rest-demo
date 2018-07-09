package com.cice.apirest.springres.web.rest;

import com.cice.apirest.springres.service.GestionUsuarioService;
import com.cice.apirest.springres.service.IGestionUsuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController("/saludo")
public class userResource {

    @Autowired
    @Qualifier("Gestion")
    IGestionUsuarios gestionUsuarios;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<String>> getUsuarios(){
        gestionUsuarios.listaNombres();
        return new ResponseEntity<>(gestionUsuarios.listaNombres(),HttpStatus.ACCEPTED);
    }

    @RequestMapping(method =  RequestMethod.POST)
    public String crearUsuario(@PathParam(value = "nombre") String nombre){
        return "hola "+ nombre;
    }
}
