package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Procedimientos;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-07-04T01:15:14")
@StaticMetamodel(TipoProcedimiento.class)
public class TipoProcedimiento_ { 

    public static volatile SingularAttribute<TipoProcedimiento, Integer> idTipoProcedimiento;
    public static volatile SingularAttribute<TipoProcedimiento, Character> clasificacion;
    public static volatile SingularAttribute<TipoProcedimiento, String> nombreProcedimiento;
    public static volatile SingularAttribute<TipoProcedimiento, String> tipoProcedimiento;
    public static volatile ListAttribute<TipoProcedimiento, Procedimientos> procedimientosList;

}