package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Especie;
import modelo.Mascota;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-07-04T01:15:14")
@StaticMetamodel(Raza.class)
public class Raza_ { 

    public static volatile SingularAttribute<Raza, Especie> especie;
    public static volatile ListAttribute<Raza, Mascota> mascotaList;
    public static volatile SingularAttribute<Raza, Integer> idRaza;
    public static volatile SingularAttribute<Raza, String> nombre;

}