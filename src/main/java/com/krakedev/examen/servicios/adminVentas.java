package com.krakedev.examen.servicios;

import com.krakedev.examen.modelo.Vendedor;

import java.util.ArrayList;

public class adminVentas {

    private ArrayList<Vendedor> vendedores = new ArrayList<>();

    public void agregar(Vendedor vendedor) {
        vendedores.add(vendedor);
    }

    public Double calcularSueldo(String cedula) {

        for (Vendedor v : vendedores) {
            if (v.getCedula().equals(cedula)) {
                return v.calcularSueldo();
            }
        }

        return null;
    }
}
