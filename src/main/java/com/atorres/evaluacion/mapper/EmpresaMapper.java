package com.atorres.evaluacion.mapper;

import com.atorres.evaluacion.entity.EmpresaEntity;
import com.atorres.evaluacion.model.Empresa;
import org.springframework.stereotype.Component;

@Component
public class EmpresaMapper {

    public EmpresaEntity toEntity(Empresa empresa){
        EmpresaEntity entity = new EmpresaEntity();
        entity.setId(toId());
        entity.setRuc(empresa.getRuc());
        entity.setRazonsocial(empresa.getRazonSocial());
        entity.setDireccion(empresa.getDireccion());
        entity.setEstado(empresa.getEstado());
        return entity;
    }

    static String toId(){
        String result = java.util.UUID.randomUUID().toString();
        return result.replaceAll("-", "");
    }

}
