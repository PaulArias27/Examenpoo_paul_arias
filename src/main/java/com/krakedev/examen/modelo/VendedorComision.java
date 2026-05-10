package com.krakedev.examen.modelo;

public class VendedorComision extends Vendedor{
    public VendedorComision(String cedula, String tipo) {
        super(cedula, tipo);
    }
    @Override
    public double calcularSueldo() {
        return getComisionPorVenta() * getNumeroVentas();
    }
}
