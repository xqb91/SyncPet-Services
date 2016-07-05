package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Hospitalizacion;
import modelo.Mascota;
import modelo.Vacunas;
import modelo.Veterinario;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-07-05T02:21:37")
@StaticMetamodel(Historialvacunas.class)
public class Historialvacunas_ { 

    public static volatile SingularAttribute<Historialvacunas, Date> fecha;
    public static volatile SingularAttribute<Historialvacunas, Vacunas> vacuna;
    public static volatile SingularAttribute<Historialvacunas, Veterinario> veterinario;
    public static volatile SingularAttribute<Historialvacunas, Integer> idEvento;
    public static volatile SingularAttribute<Historialvacunas, String> observaciones;
    public static volatile SingularAttribute<Historialvacunas, Mascota> mascota;
    public static volatile SingularAttribute<Historialvacunas, Hospitalizacion> hospitalizacion;

}