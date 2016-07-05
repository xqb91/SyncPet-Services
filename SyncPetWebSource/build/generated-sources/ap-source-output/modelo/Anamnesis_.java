package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Hospitalizacion;
import modelo.Mascota;
import modelo.Veterinario;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-07-05T02:21:37")
@StaticMetamodel(Anamnesis.class)
public class Anamnesis_ { 

    public static volatile SingularAttribute<Anamnesis, String> percusion;
    public static volatile SingularAttribute<Anamnesis, String> estadoNutricion;
    public static volatile SingularAttribute<Anamnesis, String> auscultacion;
    public static volatile SingularAttribute<Anamnesis, Veterinario> veterinario;
    public static volatile SingularAttribute<Anamnesis, Long> peso;
    public static volatile SingularAttribute<Anamnesis, String> gradoHidratacion;
    public static volatile SingularAttribute<Anamnesis, Mascota> mascota;
    public static volatile SingularAttribute<Anamnesis, String> frecuenciaRespiratoria;
    public static volatile SingularAttribute<Anamnesis, Integer> idAnamnesis;
    public static volatile SingularAttribute<Anamnesis, Date> fechaAnamnesis;
    public static volatile SingularAttribute<Anamnesis, String> actitud;
    public static volatile SingularAttribute<Anamnesis, String> palpacion;
    public static volatile SingularAttribute<Anamnesis, String> nivelMovilidad;
    public static volatile SingularAttribute<Anamnesis, String> inspeccionVisual;
    public static volatile SingularAttribute<Anamnesis, Long> temperatura;
    public static volatile SingularAttribute<Anamnesis, Hospitalizacion> hospitalizacion;
    public static volatile SingularAttribute<Anamnesis, String> olfaccion;
    public static volatile SingularAttribute<Anamnesis, String> estadoConciencia;
    public static volatile SingularAttribute<Anamnesis, String> frecuenciaCardiaca;

}