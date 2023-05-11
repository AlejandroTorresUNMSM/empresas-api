package com.atorres.evaluacion.repository;

import com.atorres.evaluacion.entity.EmpresaEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository extends CrudRepository <EmpresaEntity,String> {

}
