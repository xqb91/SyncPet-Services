package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Usuarios;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-07-05T18:23:26")
@StaticMetamodel(Perfiles.class)
public class Perfiles_ { 

    public static volatile ListAttribute<Perfiles, Usuarios> usuariosList;
    public static volatile SingularAttribute<Perfiles, Integer> id;
    public static volatile SingularAttribute<Perfiles, String> perfil;

}