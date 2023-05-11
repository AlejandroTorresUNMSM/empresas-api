package com.atorres.evaluacion.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Empresa {

    private String ruc;
    private String razonSocial;
    private String direccion;
    private String estado;

    @Override
    public String toString() {
        return "Empresa{" +
                "idEmpresa=" +
                ", ruc='" + ruc + '\'' +
                ", razonSocial='" + razonSocial + '\'' +
                ", direccion='" + direccion + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
