package com.universidad.tienda;

import com.universidad.tienda.adapter.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AdapterTest {

    @Test
    void testPagoPayPal() {
        PasarelaPago pago = new PayPalAdapter();
        boolean resultado = pago.procesarPago("USD", 100, "tok_123");

        assertTrue(resultado);
    }
}