package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Agenda;
import modelo.Mascota;
import modelo.Veterinario;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-07-05T18:23:26")
@StaticMetamodel(AgendaDetalle.class)
public class AgendaDetalle_ { 

    public static volatile SingularAttribute<AgendaDetalle, Veterinario> veterinario;
    public static volatile SingularAttribute<AgendaDetalle, Integer> idDetalle;
    public static volatile SingularAttribute<AgendaDetalle, Agenda> eventoAgenda;
    public static volatile SingularAttribute<AgendaDetalle, Mascota> mascota;

}