package com.universidad.tienda;

import com.universidad.tienda.composite.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CompositeTest {

    @Test
    void testPrecioTotal() {
        Categoria categoria = new Categoria("Test");

        categoria.agregar(new Producto("A", 100));
        categoria.agregar(new Producto("B", 200));

        double total = categoria.getPrecioTotal();

        assertEquals(300, total);
    }
}
