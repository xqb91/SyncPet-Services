package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Mascota;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-07-05T18:23:26")
@StaticMetamodel(Caracter.class)
public class Caracter_ { 

    public static volatile ListAttribute<Caracter, Mascota> mascotaList;
    public static volatile SingularAttribute<Caracter, Integer> idCaracter;
    public static volatile SingularAttribute<Caracter, String> nombre;

}