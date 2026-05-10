package com.krakedev.examen.control;
import com.krakedev.examen.modelo.Vendedor;
import com.krakedev.examen.modelo.VendedorComision;
import com.krakedev.examen.modelo.VendedorMixto;
import com.krakedev.examen.servicios.adminVentas;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/vendedores")
public class VendedorController {

    private adminVentas admin = new adminVentas();

    @PostMapping("/agregar")
    public void agregar(@RequestBody Vendedor v) {

        Vendedor nuevo;

        if (v.getTipo().equals("V")) {
            nuevo = new Vendedor(v.getCedula(), "V");
        } else if (v.getTipo().equals("C")) {
            nuevo = new VendedorComision(v.getCedula(), "C");
        } else {
            nuevo = new VendedorMixto(v.getCedula(), "M");
        }

        nuevo.setNumeroVentas(v.getNumeroVentas());
        nuevo.setSueldoFijo(v.getSueldoFijo());
        nuevo.setComisionPorVenta(v.getComisionPorVenta());

        admin.agregar(nuevo);
    }

    @GetMapping("/calcular/{cedula}")
    public Double calcular(@PathVariable String cedula) {
        return admin.calcularSueldo(cedula);
    }
}
