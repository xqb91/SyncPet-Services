package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Hospitalizacion;
import modelo.Mascota;
import modelo.TipoContraindicacion;
import modelo.Veterinario;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-07-05T02:21:37")
@StaticMetamodel(Contraindicaciones.class)
public class Contraindicaciones_ { 

    public static volatile SingularAttribute<Contraindicaciones, Veterinario> veterinario;
    public static volatile SingularAttribute<Contraindicaciones, Integer> idContraindicacion;
    public static volatile SingularAttribute<Contraindicaciones, String> observaciones;
    public static volatile SingularAttribute<Contraindicaciones, Mascota> mascota;
    public static volatile SingularAttribute<Contraindicaciones, Hospitalizacion> hospitalizacion;
    public static volatile SingularAttribute<Contraindicaciones, TipoContraindicacion> tipoContraindicicacion;

}