/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import controlador.ComunaJpaController;
import controlador.PropietarioJpaController;
import controlador.SucursalJpaController;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelo.Comuna;
import modelo.Propietario;
import modelo.Sucursal;

/**
 *
 * @author Victor Manuel Araya
 */
@WebService(serviceName = "SrvPropietarios")
public class SrvPropietarios {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("SyncPetPU");
    
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "retornaInformacionPropietario")
    public Propietario retornaInformacionPropietario(@WebParam(name = "rut") String rut) {
        try {
            return new PropietarioJpaController(emf).buscarPorRut(rut);
        } catch (Exception e) {
            return null;
        }
    }
    
    @WebMethod(operationName = "registraPropietario")
    public boolean registraPropietario(@WebParam(name = "rut") String rut, @WebParam(name = "nombres") String nombres, @WebParam(name = "apaterno") String apaterno, @WebParam(name = "amaterno") String amaterno, @WebParam(name = "correo") String correo, @WebParam(name = "telefono") int telefono, @WebParam(name = "celular") int celular, @WebParam(name = "direccion") String direccion, @WebParam(name = "comuna") int comuna, int sucusal) {
        try {
            Propietario pro = new Propietario();
            pro.setIdPropietario(new PropietarioJpaController(emf).ultimoIdentificador());
            pro.setRut(Integer.parseInt(rut.split("-")[0].replace(".", "")));
            pro.setDv(rut.split("-")[0].charAt(0));
            pro.setNombres(nombres);
            pro.setApaterno(apaterno);
            pro.setAmaterno(amaterno);
            pro.setEmail(correo);
            pro.setTelefono(telefono);
            pro.setCelular(celular);
            pro.setDireccion(direccion);
            Comuna com = new ComunaJpaController(emf).findComuna(comuna);
            pro.setComuna(com);
            Sucursal suc = new SucursalJpaController(emf).findSucursal(sucusal);
            pro.setSucursal(suc);
            
            new PropietarioJpaController(emf).create(pro);
            return true;
            
        } catch (Exception e) {
            return false;
        }
    }  
}
