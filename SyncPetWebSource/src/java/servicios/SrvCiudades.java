/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import controlador.ComunaJpaController;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelo.Comuna;

/**
 *
 * @author Victor Manuel Araya
 */
@WebService(serviceName = "SrvCiudades")
public class SrvCiudades {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("SyncPetPU");
    
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "listaCiudades")
    public List<Comuna> listaCiudades() {
        return new ComunaJpaController(emf).listar();
    }
}
