package com.restaurante;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProcesadorMenu {
    private List<Plato> menu;
    private final String rutaArchivo;

    public ProcesadorMenu(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
        this.menu = new ArrayList<>();
        cargarMenu();
    }

    /**
     * Carga el menú desde el archivo JSON en la lista `menu`.
     * Debe manejar posibles errores y dejar la lista vacía si no se puede cargar.
     */
    private void cargarMenu() {
        // Implementación aquí
    }

    /**
     * Guarda el menú actual en el archivo JSON.
     * Debe manejar posibles errores al escribir en el archivo.
     */
    private void guardarMenu() {
        // Implementación aquí
    }

    /**
     * Devuelve todos los platos del menú como una lista.
     * @return Lista de todos los platos.
     */
    public List<Plato> obtenerTodosLosPlatos() {
        // Implementación aquí
        return null; // Cambiar cuando implementen
    }

    /**
     * Filtra los platos por categoría.
     * @param categoria Categoría a filtrar (ej. "Entrante", "Principal").
     * @return Lista de platos que pertenecen a la categoría.
     */
    public List<Plato> filtrarPorCategoria(String categoria) {
        // Implementación aquí
        return null; // Cambiar cuando implementen
    }

    /**
     * Agrega un nuevo plato al menú.
     * @param plato El nuevo plato a agregar.
     */
    public void agregarPlato(Plato plato) {
        // Implementación aquí
    }

    /**
     * Elimina un plato del menú por su nombre.
     * @param nombre Nombre del plato a eliminar.
     * @return Verdadero si se eliminó correctamente, falso si no se encontró.
     */
    public boolean eliminarPlato(String nombre) {
        // Implementación aquí
        return false; // Cambiar cuando implementen
    }
}
