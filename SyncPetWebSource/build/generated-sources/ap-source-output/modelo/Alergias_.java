package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Mascota;
import modelo.TipoAlergia;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-07-05T02:21:37")
@StaticMetamodel(Alergias.class)
public class Alergias_ { 

    public static volatile SingularAttribute<Alergias, Integer> idAlergia;
    public static volatile SingularAttribute<Alergias, String> descripcion;
    public static volatile SingularAttribute<Alergias, Mascota> mascota;
    public static volatile SingularAttribute<Alergias, TipoAlergia> tipoAlergia;

}