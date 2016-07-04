package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Raza;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-07-04T01:15:14")
@StaticMetamodel(Especie.class)
public class Especie_ { 

    public static volatile ListAttribute<Especie, Raza> razaList;
    public static volatile SingularAttribute<Especie, Integer> idEspecie;
    public static volatile SingularAttribute<Especie, String> nombre;
    public static volatile SingularAttribute<Especie, String> familia;

}