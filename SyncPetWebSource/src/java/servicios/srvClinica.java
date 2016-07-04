/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import controlador.ClinicaJpaController;
import controlador.SucursalJpaController;
import modelo.Clinica;
import modelo.Sucursal;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Victor Manuel Araya
 */
@WebService(serviceName = "srvClinica")
public class srvClinica {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("SyncPetPU");
    
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "listadoClinicas")
    public List<Clinica> listadoClinicas() {
        return new ClinicaJpaController(emf).findClinicaEntities();
    }
    
    @WebMethod(operationName = "listadoSucursalByClinica")
    public List<Sucursal> listadoSucursalByClinica(@WebParam(name = "idClinica") Integer idClinica) {
        Clinica c = new ClinicaJpaController(emf).findClinica(idClinica);
        return c.getSucursalList();
    }
    
    @WebMethod(operationName = "listadoSucursales")
    public List<Sucursal> listadoSucursales() {
        return new SucursalJpaController(emf).findSucursalEntities();
    }   
    
    @WebMethod(operationName = "getSucursal")
    public Sucursal getSucursal(@WebParam(name = "idClinica")Integer idClinica) {
        try {
            return new SucursalJpaController(emf).findSucursal(idClinica);   
        } catch (Exception e) {
            return null;
        }
    }   
}
