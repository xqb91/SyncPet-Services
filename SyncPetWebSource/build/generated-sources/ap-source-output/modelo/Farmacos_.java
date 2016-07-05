package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Hospitalizacion;
import modelo.Mascota;
import modelo.TipoFarmaco;
import modelo.Veterinario;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-07-05T02:21:37")
@StaticMetamodel(Farmacos.class)
public class Farmacos_ { 

    public static volatile SingularAttribute<Farmacos, Veterinario> veterinario;
    public static volatile SingularAttribute<Farmacos, Integer> idFarmaco;
    public static volatile SingularAttribute<Farmacos, Date> fechaSuministro;
    public static volatile SingularAttribute<Farmacos, Mascota> mascota;
    public static volatile SingularAttribute<Farmacos, TipoFarmaco> farmaco;
    public static volatile SingularAttribute<Farmacos, Hospitalizacion> hospitalizacion;
    public static volatile SingularAttribute<Farmacos, String> observacion;

}