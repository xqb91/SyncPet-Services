package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Historialvacunas;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-07-05T02:21:37")
@StaticMetamodel(Vacunas.class)
public class Vacunas_ { 

    public static volatile SingularAttribute<Vacunas, String> descripcion;
    public static volatile ListAttribute<Vacunas, Historialvacunas> historialvacunasList;
    public static volatile SingularAttribute<Vacunas, Integer> idVacuna;
    public static volatile SingularAttribute<Vacunas, String> compuestoActivo;
    public static volatile SingularAttribute<Vacunas, String> nombre;

}