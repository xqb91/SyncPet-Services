package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Agenda;
import modelo.Clinica;
import modelo.Comuna;
import modelo.DetalleUsuarios;
import modelo.Propietario;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-07-04T01:15:14")
@StaticMetamodel(Sucursal.class)
public class Sucursal_ { 

    public static volatile SingularAttribute<Sucursal, Integer> idSucursal;
    public static volatile ListAttribute<Sucursal, DetalleUsuarios> detalleUsuariosList;
    public static volatile ListAttribute<Sucursal, Propietario> propietarioList;
    public static volatile SingularAttribute<Sucursal, Clinica> clinica;
    public static volatile SingularAttribute<Sucursal, String> direccion;
    public static volatile SingularAttribute<Sucursal, Comuna> comuna;
    public static volatile ListAttribute<Sucursal, Agenda> agendaList;
    public static volatile SingularAttribute<Sucursal, Integer> telefono;
    public static volatile SingularAttribute<Sucursal, String> nombre;
    public static volatile SingularAttribute<Sucursal, String> email;

}