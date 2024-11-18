package com.restaurante;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ProcesadorMenuTest {
    private ProcesadorMenu procesadorMenu;

    @Before
    public void setUp() {
        procesadorMenu = new ProcesadorMenu("menu.json");
    }

    @Test
    public void testObtenerTodosLosPlatos() {
        List<Plato> platos = procesadorMenu.obtenerTodosLosPlatos();
        assertNotNull("La lista de platos no debe ser null", platos);
    }

    @Test
    public void testAgregarPlato() {
        Plato nuevoPlato = new Plato("Tarta de Queso", 5.0, "Postre");
        procesadorMenu.agregarPlato(nuevoPlato);

        List<Plato> platos = procesadorMenu.obtenerTodosLosPlatos();
        assertTrue("El menú debe contener el nuevo plato", platos.contains(nuevoPlato));
    }

    @Test
    public void testEliminarPlato() {
        Plato nuevoPlato = new Plato("Hamburguesa", 10.0, "Principal");
        procesadorMenu.agregarPlato(nuevoPlato);

        boolean eliminado = procesadorMenu.eliminarPlato("Hamburguesa");
        assertTrue("El plato debe ser eliminado correctamente", eliminado);

        List<Plato> platos = procesadorMenu.obtenerTodosLosPlatos();
        assertFalse("El menú no debe contener el plato eliminado", platos.stream()
                .anyMatch(plato -> plato.getNombre().equalsIgnoreCase("Hamburguesa")));
    }
}
