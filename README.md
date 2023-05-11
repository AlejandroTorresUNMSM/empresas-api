# Proyecto Evaluacion  Empresas
Proyecto en Spring boot , usando bd h2 y Spring Security con JWT.


## API Traer empresas
GET localhost:8080/v1/empresa/traer

Authorization : Basic Auth
```
username : admin
password : admin
```
Resultado : 
```
[
    {
        "id": "1235644512",
        "ruc": "12345678901",
        "razonsocial": "universidad nacional mayor de san marcos",
        "direccion": "Lima,Peru",
        "estado": "abierto"
    },
    {
        "id": "1212476545",
        "ruc": "98765432198",
        "razonsocial": "universidad nacional ingenieria",
        "direccion": "Lima,Peru",
        "estado": "abierto"
    }
]
```

## API Crear empresa
GET localhost:8080/v1/empresa/crear

Authorization : Basic Auth
```
username : admin
password : admin
```
Body :
```
{
    "ruc" : "45612378955",
    "razonSocial" :"upn",
    "direccion" : "lima lima",
    "estado" : "cerrado"
}
```
Resultado esperado: 
```
{
    "ruc" : "45612378955",
    "razonSocial" :"upn",
    "direccion" : "lima lima",
    "estado" : "cerrado"
}
```