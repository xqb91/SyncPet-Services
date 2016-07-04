package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Pais;
import modelo.Provincia;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-07-04T01:15:14")
@StaticMetamodel(Region.class)
public class Region_ { 

    public static volatile SingularAttribute<Region, Integer> idRegion;
    public static volatile SingularAttribute<Region, String> nombre;
    public static volatile ListAttribute<Region, Provincia> provinciaList;
    public static volatile SingularAttribute<Region, Pais> pais;

}