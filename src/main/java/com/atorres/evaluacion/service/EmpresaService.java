package com.atorres.evaluacion.service;

import com.atorres.evaluacion.entity.EmpresaEntity;
import com.atorres.evaluacion.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpresaService implements IEmpresaService{
    @Autowired
    private EmpresaRepository empresaRepository;
    public EmpresaEntity crear(EmpresaEntity empresa){
        empresaRepository.save(empresa);
        return empresa;
    }

    public List<EmpresaEntity> mostrar(){
        List<EmpresaEntity> empresaList= new ArrayList<>();
        empresaRepository.findAll().forEach(empresaList::add);

        return empresaList;
    }

}
