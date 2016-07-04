package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Mascota;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-07-04T01:15:14")
@StaticMetamodel(Habitad.class)
public class Habitad_ { 

    public static volatile SingularAttribute<Habitad, String> descripcion;
    public static volatile ListAttribute<Habitad, Mascota> mascotaList;
    public static volatile SingularAttribute<Habitad, Integer> idHabitad;
    public static volatile SingularAttribute<Habitad, String> nombre;

}