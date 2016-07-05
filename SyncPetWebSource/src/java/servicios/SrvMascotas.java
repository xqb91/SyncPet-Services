/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import controlador.CaracterJpaController;
import controlador.HabitadJpaController;
import controlador.MascotaJpaController;
import controlador.PropietarioJpaController;
import controlador.RazaJpaController;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelo.Caracter;
import modelo.Habitad;
import modelo.Mascota;
import modelo.Propietario;
import modelo.Raza;

/**
 *
 * @author Victor Manuel Araya
 */
@WebService(serviceName = "SrvMascotas")
public class SrvMascotas {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("SyncPetPU");
    
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "listadoMascotasPorPropietario")
    public List<Mascota> listadoMascotasPorPropietario(@WebParam(name = "propietario") Propietario propietario) {
        try {
            return new MascotaJpaController(emf).buscarPorPropietario(propietario);
        }catch(Exception e) {
            return null;
        }
    }
    
    @WebMethod(operationName = "listadoRazas")
    public List<Raza> listadoRazas(){
        try {
            return new RazaJpaController(emf).findRazaEntities();
        }catch(Exception e) {
            return null;
        }
    }
    
    @WebMethod(operationName = "listadoCaracter")
    public List<Caracter> listadoCaracter(){
        try {
            return new CaracterJpaController(emf).findCaracterEntities();
        }catch(Exception e) {
            return null;
        }
    }
    
    @WebMethod(operationName = "listadoGruposSanguineos")
    public ArrayList listadoGruposSanguineos(){
        try {
            ArrayList array = new ArrayList();
            array.add("DEA");
            array.add("A");
            array.add("AB");
            array.add("B");
            array.add("C");
            array.add("D");
            array.add("F");
            array.add("J");
            array.add("K");
            array.add("L");
            array.add("M");
            array.add("R");
            array.add("S");
            array.add("T");
            array.add("P");
            array.add("Q");
            array.add("U");
            array.add("Z");
            return array;
        }catch(Exception e) {
            return null;
        }
    }
    
    @WebMethod(operationName = "registrarMascota")
    public boolean registrarMascota(@WebParam(name = "nombre") String nombre, @WebParam(name = "fecnac") Date fecnac, @WebParam(name = "sexo") char sexo, @WebParam(name = "nroChip") int nroChip, @WebParam(name = "propietario") int propietario, @WebParam(name = "raza") int raza, @WebParam(name = "caracter") int caracter, @WebParam(name = "habitad") int habitad, @WebParam(name = "grupoSanguineo") String grupoSanguineo) {
        try {
            MascotaJpaController ma = new MascotaJpaController(emf);
            Mascota m = new Mascota();
            m.setIdMascota(ma.ultimo());
            m.setNombre(nombre);
            m.setFechaNacimiento(fecnac);
            m.setSexo(sexo);
            m.setNumeroChip(nroChip);
            Propietario pro = new PropietarioJpaController(emf).findPropietario(propietario);
            m.setPropietario(pro);
            Raza ra = new RazaJpaController(emf).findRaza(raza);
            m.setRaza(ra);
            Caracter ca = new CaracterJpaController(emf).findCaracter(caracter);
            m.setCaracter(ca);
            Habitad ha = new HabitadJpaController(emf).findHabitad(habitad);
            m.setHabitad(ha);
            m.setGrupoSanguineo(grupoSanguineo);
            
            ma.create(m);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

   @WebMethod(operationName = "buscarMascotaById")
    public Mascota buscarMascotaById(@WebParam(name = "id") int id) {
        try {
            return new MascotaJpaController(emf).findMascota(id);
        }catch(Exception e) {
            return null;
        }
    }
}
