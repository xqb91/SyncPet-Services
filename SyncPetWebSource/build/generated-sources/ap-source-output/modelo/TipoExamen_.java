package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Examenes;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-07-05T02:21:37")
@StaticMetamodel(TipoExamen.class)
public class TipoExamen_ { 

    public static volatile ListAttribute<TipoExamen, Examenes> examenesList;
    public static volatile SingularAttribute<TipoExamen, String> descripcióm;
    public static volatile SingularAttribute<TipoExamen, Integer> costo;
    public static volatile SingularAttribute<TipoExamen, String> nombreExamen;
    public static volatile SingularAttribute<TipoExamen, Integer> idTipoExamen;

}