package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Contraindicaciones;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-07-05T18:23:26")
@StaticMetamodel(TipoContraindicacion.class)
public class TipoContraindicacion_ { 

    public static volatile SingularAttribute<TipoContraindicacion, Integer> idTipoContraindicacion;
    public static volatile SingularAttribute<TipoContraindicacion, String> tipoContraindicacion;
    public static volatile SingularAttribute<TipoContraindicacion, String> nombreContraindicacion;
    public static volatile ListAttribute<TipoContraindicacion, Contraindicaciones> contraindicacionesList;

}