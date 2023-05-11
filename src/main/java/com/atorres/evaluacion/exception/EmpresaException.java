package com.atorres.evaluacion.exception;

public class EmpresaException  extends Exception{
    public EmpresaException(String mensaje) {
        super("Problema:" + mensaje);
    }
}
