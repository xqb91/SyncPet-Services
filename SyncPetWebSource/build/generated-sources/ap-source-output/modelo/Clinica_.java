package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Sucursal;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-07-05T18:23:26")
@StaticMetamodel(Clinica.class)
public class Clinica_ { 

    public static volatile SingularAttribute<Clinica, String> nombreFantasia;
    public static volatile SingularAttribute<Clinica, Integer> rut;
    public static volatile SingularAttribute<Clinica, Integer> idClinica;
    public static volatile ListAttribute<Clinica, Sucursal> sucursalList;
    public static volatile SingularAttribute<Clinica, Character> dv;
    public static volatile SingularAttribute<Clinica, String> nombreReal;

}