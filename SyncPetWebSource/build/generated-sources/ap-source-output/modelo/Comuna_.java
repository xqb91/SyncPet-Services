package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Propietario;
import modelo.Provincia;
import modelo.Sucursal;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-07-05T18:23:26")
@StaticMetamodel(Comuna.class)
public class Comuna_ { 

    public static volatile ListAttribute<Comuna, Sucursal> sucursalList;
    public static volatile ListAttribute<Comuna, Propietario> propietarioList;
    public static volatile SingularAttribute<Comuna, Integer> idComuna;
    public static volatile SingularAttribute<Comuna, Provincia> provincia;
    public static volatile SingularAttribute<Comuna, String> nombre;

}