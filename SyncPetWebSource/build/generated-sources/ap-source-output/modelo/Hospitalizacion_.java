package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Anamnesis;
import modelo.Contraindicaciones;
import modelo.Desparacitaciones;
import modelo.Examenes;
import modelo.Farmacos;
import modelo.Historialvacunas;
import modelo.Mascota;
import modelo.Patologias;
import modelo.Procedimientos;
import modelo.Veterinario;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-07-05T18:23:26")
@StaticMetamodel(Hospitalizacion.class)
public class Hospitalizacion_ { 

    public static volatile ListAttribute<Hospitalizacion, Historialvacunas> historialvacunasList;
    public static volatile SingularAttribute<Hospitalizacion, Veterinario> veterinario;
    public static volatile ListAttribute<Hospitalizacion, Examenes> examenesList;
    public static volatile ListAttribute<Hospitalizacion, Patologias> patologiasList;
    public static volatile SingularAttribute<Hospitalizacion, Date> fechaAltaMedica;
    public static volatile SingularAttribute<Hospitalizacion, Mascota> mascota;
    public static volatile ListAttribute<Hospitalizacion, Procedimientos> procedimientosList;
    public static volatile SingularAttribute<Hospitalizacion, Date> fechaIngreso;
    public static volatile ListAttribute<Hospitalizacion, Contraindicaciones> contraindicacionesList;
    public static volatile ListAttribute<Hospitalizacion, Desparacitaciones> desparacitacionesList;
    public static volatile ListAttribute<Hospitalizacion, Anamnesis> anamnesisList;
    public static volatile ListAttribute<Hospitalizacion, Farmacos> farmacosList;
    public static volatile SingularAttribute<Hospitalizacion, Integer> idHospitalizacion;

}