package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Hospitalizacion;
import modelo.Mascota;
import modelo.TipoPatologia;
import modelo.Veterinario;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-07-05T18:23:26")
@StaticMetamodel(Patologias.class)
public class Patologias_ { 

    public static volatile SingularAttribute<Patologias, Integer> idPatologia;
    public static volatile SingularAttribute<Patologias, Veterinario> veterinario;
    public static volatile SingularAttribute<Patologias, TipoPatologia> tipoPatologia;
    public static volatile SingularAttribute<Patologias, Date> fechaDeteccion;
    public static volatile SingularAttribute<Patologias, Mascota> mascota;
    public static volatile SingularAttribute<Patologias, Hospitalizacion> hospitalizacion;
    public static volatile SingularAttribute<Patologias, String> observacion;

}