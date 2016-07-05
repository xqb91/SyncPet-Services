/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import controlador.AgendaDetalleJpaController;
import controlador.AgendaJpaController;
import controlador.DetalleUsuariosJpaController;
import controlador.MascotaJpaController;
import controlador.SucursalJpaController;
import controlador.VeterinarioJpaController;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelo.Agenda;
import modelo.AgendaDetalle;
import modelo.DetalleUsuarios;
import modelo.Mascota;
import modelo.Propietario;
import modelo.Sucursal;
import modelo.Veterinario;

/**
 *
 * @author Victor Manuel Araya
 */
@WebService(serviceName = "SrvAgendamiento")
public class SrvAgendamiento {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("SyncPetPU");
    
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "listaVeterinarios")
    public List<DetalleUsuarios> listaVeterinarios() {
        try {
            return new DetalleUsuariosJpaController(emf).findDetalleUsuariosEntities();
        } catch (Exception e) {
            return null;
        }
    }
    
    @WebMethod(operationName = "horasOcupadas")
    public List<Agenda> horasOcupadas(@WebParam(name = "fecha") Date fecha) {
        try {
            Calendar calIni = new GregorianCalendar();
                calIni.set(Calendar.DAY_OF_MONTH, fecha.getDay());
                calIni.set(Calendar.MONTH, fecha.getMonth());
                calIni.set(Calendar.YEAR, fecha.getYear());
                calIni.set(Calendar.HOUR_OF_DAY, 00);
                calIni.set(Calendar.MINUTE, 00);
                calIni.set(Calendar.SECOND, 00);
                calIni.set(Calendar.MILLISECOND, 000);
            
            Calendar calFin = new GregorianCalendar();
                calFin.set(Calendar.DAY_OF_MONTH, fecha.getDay());
                calFin.set(Calendar.MONTH, fecha.getMonth());
                calFin.set(Calendar.YEAR, fecha.getYear());
                calFin.set(Calendar.HOUR_OF_DAY, 23);
                calFin.set(Calendar.MINUTE, 59);
                calFin.set(Calendar.SECOND, 59);
                calFin.set(Calendar.MILLISECOND, 999);
                
            return new AgendaJpaController(emf).eventosPorFecha(calIni.getTime(), calFin.getTime());
        } catch (Exception e) {
            return null;
        }
    }
    
    @WebMethod(operationName = "agendarHorario")
    public boolean agendarHorario(@WebParam(name = "fecha") Date fecha, @WebParam(name = "sucursal") int sucursal, @WebParam(name = "veterinario") int veterinario, @WebParam(name = "paciente") int paciente) {
        try {
            AgendaJpaController jpa = new AgendaJpaController(emf);
            Agenda ag = new Agenda();
                ag.setIdEvento(jpa.ultimo());
                ag.setFechaEvento(fecha);
                ag.setEstado("0");
                Sucursal suc = new SucursalJpaController(emf).findSucursal(sucursal);
                ag.setSucursal(suc);
                
            AgendaDetalleJpaController jpb = new AgendaDetalleJpaController(emf);
                AgendaDetalle agdet = new AgendaDetalle();
                agdet.setIdDetalle(jpb.ultimo());
                Veterinario vet = new VeterinarioJpaController(emf).findVeterinario(veterinario);
                agdet.setVeterinario(vet);
                Mascota mas = new MascotaJpaController(emf).findMascota(paciente);
                agdet.setMascota(mas);
                agdet.setEventoAgenda(ag);
                
            jpa.create(ag);
            jpb.create(agdet);
            return true;
        } catch (Exception e) {
            return false;
        }
    }    
    
    @WebMethod(operationName = "ultimoEventoRegistrado")
    public Agenda ultimoEventoRegistrado(@WebParam(name = "pro") Propietario pro) {
        try {
            AgendaJpaController jpa = new AgendaJpaController(emf);
            return jpa.ultimaAtencionAgendada(pro);
        } catch (Exception e) {
            return null;
        }
    }
    
    @WebMethod(operationName = "detalleUltimoEventoRegistrado")
    public AgendaDetalle detalleUltimoEventoRegistrado(@WebParam(name = "pro") Propietario pro) {
        try {
            Agenda ag = this.ultimoEventoRegistrado(pro);
            AgendaDetalleJpaController jpa = new AgendaDetalleJpaController(emf);
            return  jpa.buscarPorAgenda(ag);
        } catch (Exception e) {
            return null;
        }
    }
    
}
