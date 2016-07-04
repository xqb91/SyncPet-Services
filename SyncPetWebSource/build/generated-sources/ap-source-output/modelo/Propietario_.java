package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Comuna;
import modelo.Mascota;
import modelo.Sucursal;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-07-04T01:15:14")
@StaticMetamodel(Propietario.class)
public class Propietario_ { 

    public static volatile SingularAttribute<Propietario, Integer> idPropietario;
    public static volatile SingularAttribute<Propietario, String> direccion;
    public static volatile SingularAttribute<Propietario, String> nombres;
    public static volatile SingularAttribute<Propietario, Integer> rut;
    public static volatile ListAttribute<Propietario, Mascota> mascotaList;
    public static volatile SingularAttribute<Propietario, Character> dv;
    public static volatile SingularAttribute<Propietario, String> apaterno;
    public static volatile SingularAttribute<Propietario, Sucursal> sucursal;
    public static volatile SingularAttribute<Propietario, Comuna> comuna;
    public static volatile SingularAttribute<Propietario, Integer> celular;
    public static volatile SingularAttribute<Propietario, String> amaterno;
    public static volatile SingularAttribute<Propietario, Integer> telefono;
    public static volatile SingularAttribute<Propietario, String> email;

}