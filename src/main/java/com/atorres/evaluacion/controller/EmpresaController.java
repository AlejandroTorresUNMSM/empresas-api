package com.atorres.evaluacion.controller;

import com.atorres.evaluacion.entity.EmpresaEntity;
import com.atorres.evaluacion.exception.EmpresaException;
import com.atorres.evaluacion.mapper.EmpresaMapper;
import com.atorres.evaluacion.model.Empresa;
import com.atorres.evaluacion.service.EmpresaService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController("Controller para los servicios de empresa")
@RequestMapping("/v1/empresa")
public class EmpresaController {
    @Autowired
    private  EmpresaService empresaService;
    @Autowired
    private EmpresaMapper empresaMapper;

    @ApiOperation(value = "Endpoint que crea empresas")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Success Operation"),
            @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 412, message = "Precondition Failed. Para casos en los que falle el servicio por errores de negocio al consumir otros servicios"),
            @ApiResponse(code = 500, message = "Internal Server Error"),
            @ApiResponse(code = 503, message = "Service Unavailable")
    })
    @PostMapping(value = "/crear")
    public ResponseEntity<EmpresaEntity> create(
            @Valid @RequestBody Empresa empresaDTO) throws EmpresaException {
        EmpresaEntity empresaEntity = empresaMapper.toEntity(empresaDTO);

        return ResponseEntity.ok(empresaService.crear(empresaEntity));
    }
    @ApiOperation(value = "Endpoint trae las 3 ultimas empresas")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Success Operation"),
            @ApiResponse(code = 400, message = "Bad Request"),
            @ApiResponse(code = 412, message = "Precondition Failed. Para casos en los que falle el servicio por errores de negocio al consumir otros servicios"),
            @ApiResponse(code = 500, message = "Internal Server Error"),
            @ApiResponse(code = 503, message = "Service Unavailable")
    })
    @GetMapping(value = "/traer")
    public ResponseEntity<List<EmpresaEntity>> getEmpresas() {
        return ResponseEntity.ok(empresaService.mostrar());
    }

    @GetMapping(value = "/test")
    public String getPrueba() {
        return "Hola mundo";
    }


}
