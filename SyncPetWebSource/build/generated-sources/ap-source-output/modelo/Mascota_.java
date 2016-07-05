package modelo;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.AgendaDetalle;
import modelo.Alergias;
import modelo.Anamnesis;
import modelo.Caracter;
import modelo.Contraindicaciones;
import modelo.Desparacitaciones;
import modelo.Examenes;
import modelo.Farmacos;
import modelo.Habitad;
import modelo.Historialvacunas;
import modelo.Hospitalizacion;
import modelo.Mascota;
import modelo.Patologias;
import modelo.Procedimientos;
import modelo.Propietario;
import modelo.Raza;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-07-05T18:23:26")
@StaticMetamodel(Mascota.class)
public class Mascota_ { 

    public static volatile SingularAttribute<Mascota, Date> fechaNacimiento;
    public static volatile ListAttribute<Mascota, Patologias> patologiasList;
    public static volatile SingularAttribute<Mascota, Integer> numeroChip;
    public static volatile SingularAttribute<Mascota, Integer> idMascota;
    public static volatile SingularAttribute<Mascota, String> nombre;
    public static volatile ListAttribute<Mascota, Procedimientos> procedimientosList;
    public static volatile SingularAttribute<Mascota, Mascota> padre;
    public static volatile SingularAttribute<Mascota, Date> defuncion;
    public static volatile ListAttribute<Mascota, Contraindicaciones> contraindicacionesList;
    public static volatile ListAttribute<Mascota, Desparacitaciones> desparacitacionesList;
    public static volatile ListAttribute<Mascota, Hospitalizacion> hospitalizacionList;
    public static volatile ListAttribute<Mascota, AgendaDetalle> agendaDetalleList;
    public static volatile ListAttribute<Mascota, Mascota> mascotaList1;
    public static volatile ListAttribute<Mascota, Historialvacunas> historialvacunasList;
    public static volatile ListAttribute<Mascota, Examenes> examenesList;
    public static volatile SingularAttribute<Mascota, Raza> raza;
    public static volatile SingularAttribute<Mascota, BigInteger> peso;
    public static volatile SingularAttribute<Mascota, Propietario> propietario;
    public static volatile ListAttribute<Mascota, Alergias> alergiasList;
    public static volatile SingularAttribute<Mascota, Mascota> madre;
    public static volatile ListAttribute<Mascota, Mascota> mascotaList;
    public static volatile SingularAttribute<Mascota, Habitad> habitad;
    public static volatile SingularAttribute<Mascota, String> grupoSanguineo;
    public static volatile SingularAttribute<Mascota, String> foto;
    public static volatile SingularAttribute<Mascota, Caracter> caracter;
    public static volatile SingularAttribute<Mascota, Character> sexo;
    public static volatile ListAttribute<Mascota, Anamnesis> anamnesisList;
    public static volatile ListAttribute<Mascota, Farmacos> farmacosList;

}