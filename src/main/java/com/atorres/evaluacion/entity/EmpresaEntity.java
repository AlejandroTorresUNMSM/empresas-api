package com.atorres.evaluacion.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "empresa")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EmpresaEntity implements Serializable {
    @Id
    private String id;
    @Column
    private String ruc;
    @Column
    private String razonsocial;
    @Column
    private String direccion;
    @Column
    private String estado;

    @Override
    public String toString() {
        return "EmpresaEntity{" +
                "idEmpresa='" + id + '\'' +
                ", ruc='" + ruc + '\'' +
                ", razonSocial='" + razonsocial + '\'' +
                ", direccion='" + direccion + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
