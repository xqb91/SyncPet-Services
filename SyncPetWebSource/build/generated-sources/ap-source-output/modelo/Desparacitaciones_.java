package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Hospitalizacion;
import modelo.Mascota;
import modelo.Veterinario;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-07-04T01:15:14")
@StaticMetamodel(Desparacitaciones.class)
public class Desparacitaciones_ { 

    public static volatile SingularAttribute<Desparacitaciones, String> descripcion;
    public static volatile SingularAttribute<Desparacitaciones, Date> fecha;
    public static volatile SingularAttribute<Desparacitaciones, Veterinario> especialista;
    public static volatile SingularAttribute<Desparacitaciones, Integer> idDesparacitacion;
    public static volatile SingularAttribute<Desparacitaciones, Mascota> mascota;
    public static volatile SingularAttribute<Desparacitaciones, Hospitalizacion> hospitalizacion;

}