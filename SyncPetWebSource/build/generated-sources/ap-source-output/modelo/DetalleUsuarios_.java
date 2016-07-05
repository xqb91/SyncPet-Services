package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Sucursal;
import modelo.Usuarios;
import modelo.Veterinario;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-07-05T02:21:37")
@StaticMetamodel(DetalleUsuarios.class)
public class DetalleUsuarios_ { 

    public static volatile SingularAttribute<DetalleUsuarios, Veterinario> veterinario;
    public static volatile SingularAttribute<DetalleUsuarios, Sucursal> sucursal;
    public static volatile SingularAttribute<DetalleUsuarios, Usuarios> usuario;
    public static volatile SingularAttribute<DetalleUsuarios, Integer> id;

}