package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Alergias;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-07-04T01:15:14")
@StaticMetamodel(TipoAlergia.class)
public class TipoAlergia_ { 

    public static volatile SingularAttribute<TipoAlergia, Integer> idTipoAlergia;
    public static volatile SingularAttribute<TipoAlergia, String> nombre;
    public static volatile ListAttribute<TipoAlergia, Alergias> alergiasList;

}