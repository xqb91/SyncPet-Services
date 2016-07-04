package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Hospitalizacion;
import modelo.Mascota;
import modelo.TipoExamen;
import modelo.Veterinario;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-07-04T01:15:14")
@StaticMetamodel(Examenes.class)
public class Examenes_ { 

    public static volatile SingularAttribute<Examenes, Integer> idExamen;
    public static volatile SingularAttribute<Examenes, Veterinario> veterinario;
    public static volatile SingularAttribute<Examenes, Date> fechaSolicitud;
    public static volatile SingularAttribute<Examenes, String> resultado;
    public static volatile SingularAttribute<Examenes, String> archivo;
    public static volatile SingularAttribute<Examenes, Mascota> mascota;
    public static volatile SingularAttribute<Examenes, TipoExamen> tipoExamen;
    public static volatile SingularAttribute<Examenes, Hospitalizacion> hospitalizacion;
    public static volatile SingularAttribute<Examenes, String> observacion;

}