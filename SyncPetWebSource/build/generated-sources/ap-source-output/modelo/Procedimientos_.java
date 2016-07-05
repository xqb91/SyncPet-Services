package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Hospitalizacion;
import modelo.Mascota;
import modelo.TipoProcedimiento;
import modelo.Veterinario;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-07-05T18:23:26")
@StaticMetamodel(Procedimientos.class)
public class Procedimientos_ { 

    public static volatile SingularAttribute<Procedimientos, Date> fecha;
    public static volatile SingularAttribute<Procedimientos, Veterinario> veterinario;
    public static volatile SingularAttribute<Procedimientos, Integer> idProcedimiento;
    public static volatile SingularAttribute<Procedimientos, String> observaciones;
    public static volatile SingularAttribute<Procedimientos, Mascota> mascota;
    public static volatile SingularAttribute<Procedimientos, Hospitalizacion> hospitalizacion;
    public static volatile SingularAttribute<Procedimientos, TipoProcedimiento> tipoProcedimiento;

}