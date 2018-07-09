package com.cice.apirest.springres.service;

import java.util.List;

public interface IGestionUsuarios {

    /**
     * Metodo que recupera una lista de nombres de usuarios
     * @return
     */

    public List<String> listaNombres();

    /**
     * Metodo que crea un nuevo recurso en base de datos
     * @param nombre
     * @return
     */

    boolean crearUsuario(String nombre);

    /**
     * Metodo que actualiza un usuario de la base de datos
     * @param nombre
     * @return
     */

    boolean actualizarUsuario(String nombre);

    /**
     * Metodo que borra un usuario
     * @param nombre
     * @return
     */

    String eliminarUsuario(String nombre);
}
