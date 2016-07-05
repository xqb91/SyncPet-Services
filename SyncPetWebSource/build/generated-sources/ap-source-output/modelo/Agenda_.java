package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.AgendaDetalle;
import modelo.Sucursal;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-07-05T02:21:37")
@StaticMetamodel(Agenda.class)
public class Agenda_ { 

    public static volatile SingularAttribute<Agenda, Date> fechaEvento;
    public static volatile SingularAttribute<Agenda, String> estado;
    public static volatile SingularAttribute<Agenda, Sucursal> sucursal;
    public static volatile SingularAttribute<Agenda, Integer> idEvento;
    public static volatile ListAttribute<Agenda, AgendaDetalle> agendaDetalleList;

}