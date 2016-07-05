package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.AgendaDetalle;
import modelo.Anamnesis;
import modelo.Contraindicaciones;
import modelo.Desparacitaciones;
import modelo.DetalleUsuarios;
import modelo.Examenes;
import modelo.Farmacos;
import modelo.Historialvacunas;
import modelo.Hospitalizacion;
import modelo.Patologias;
import modelo.Procedimientos;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-07-05T18:23:26")
@StaticMetamodel(Veterinario.class)
public class Veterinario_ { 

    public static volatile ListAttribute<Veterinario, DetalleUsuarios> detalleUsuariosList;
    public static volatile ListAttribute<Veterinario, Historialvacunas> historialvacunasList;
    public static volatile ListAttribute<Veterinario, Examenes> examenesList;
    public static volatile ListAttribute<Veterinario, Patologias> patologiasList;
    public static volatile SingularAttribute<Veterinario, Integer> idVeterinario;
    public static volatile SingularAttribute<Veterinario, String> especialidad;
    public static volatile ListAttribute<Veterinario, Procedimientos> procedimientosList;
    public static volatile SingularAttribute<Veterinario, String> nombres;
    public static volatile SingularAttribute<Veterinario, String> rut;
    public static volatile SingularAttribute<Veterinario, Character> dv;
    public static volatile SingularAttribute<Veterinario, String> apaterno;
    public static volatile ListAttribute<Veterinario, Contraindicaciones> contraindicacionesList;
    public static volatile ListAttribute<Veterinario, Desparacitaciones> desparacitacionesList;
    public static volatile SingularAttribute<Veterinario, String> amaterno;
    public static volatile ListAttribute<Veterinario, Anamnesis> anamnesisList;
    public static volatile ListAttribute<Veterinario, Farmacos> farmacosList;
    public static volatile ListAttribute<Veterinario, Hospitalizacion> hospitalizacionList;
    public static volatile ListAttribute<Veterinario, AgendaDetalle> agendaDetalleList;

}