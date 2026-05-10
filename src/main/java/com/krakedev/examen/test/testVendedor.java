package com.krakedev.examen.test;

import com.krakedev.examen.modelo.Vendedor;
import com.krakedev.examen.modelo.VendedorComision;
import com.krakedev.examen.modelo.VendedorMixto;
import org.junit.Test;

import static org.junit.Assert.assertEquals;



public class testVendedor {

    @Test
    public void testVendedorNormal() {
        Vendedor v = new Vendedor("1", "V");
        v.setSueldoFijo(1000);

        assertEquals(1000, v.calcularSueldo());
    }

    @Test
    public void testVendedorComision() {
        VendedorComision v = new VendedorComision("2", "C");
        v.setNumeroVentas(5);
        v.setComisionPorVenta(100);

        assertEquals(500, v.calcularSueldo());
    }

    @Test
    public void testVendedorMixto() {
        VendedorMixto v = new VendedorMixto("3", "M");
        v.setSueldoFijo(1000);
        v.setNumeroVentas(10);

        assertEquals(1100, v.calcularSueldo());
    }
}
