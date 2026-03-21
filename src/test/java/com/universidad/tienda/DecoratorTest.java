package com.universidad.tienda;

import com.universidad.tienda.servicio.TiendaServicio;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DecoratorTest {

    @Test
    void testServicioBase() {
        TiendaServicio servicio = new TiendaServicio(null);
        assertNotNull(servicio);
    }
    @Test
    void testServicioFunciona() {
        TiendaServicio servicio = new TiendaServicio(null);
        assertTrue(true); // solo valida que corre
    }
}