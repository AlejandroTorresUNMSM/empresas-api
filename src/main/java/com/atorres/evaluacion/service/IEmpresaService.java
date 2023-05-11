package com.atorres.evaluacion.service;

import com.atorres.evaluacion.entity.EmpresaEntity;

import java.util.List;

public interface IEmpresaService {
    EmpresaEntity crear(EmpresaEntity empresa);
    List<EmpresaEntity> mostrar();
}
