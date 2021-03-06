package com.cice.apirest.springres.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service("Gestion")
public class GestionUsuarioService implements IGestionUsuarios {

    @Override
    public List<String> listaNombres() {

        return Arrays.asList(new String[]{"Alexis","Ramon", "Jorge"});
    }

    @Override
    public boolean crearUsuario(String nombre) {
        return false;
    }

    @Override
    public boolean actualizarUsuario(String nombre) {
        return false;
    }

    @Override
    public String eliminarUsuario(String nombre) {
        return null;
    }
}
