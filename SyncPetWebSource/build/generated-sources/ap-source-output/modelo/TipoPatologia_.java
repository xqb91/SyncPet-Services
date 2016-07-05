package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Patologias;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-07-05T18:23:26")
@StaticMetamodel(TipoPatologia.class)
public class TipoPatologia_ { 

    public static volatile SingularAttribute<TipoPatologia, String> etiologia;
    public static volatile SingularAttribute<TipoPatologia, String> morfologia;
    public static volatile SingularAttribute<TipoPatologia, String> nombrePatologia;
    public static volatile ListAttribute<TipoPatologia, Patologias> patologiasList;
    public static volatile SingularAttribute<TipoPatologia, String> patogenia;
    public static volatile SingularAttribute<TipoPatologia, Integer> idTipoPatologia;

}