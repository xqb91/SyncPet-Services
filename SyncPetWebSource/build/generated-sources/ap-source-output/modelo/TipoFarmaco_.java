package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Farmacos;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-07-05T02:21:37")
@StaticMetamodel(TipoFarmaco.class)
public class TipoFarmaco_ { 

    public static volatile SingularAttribute<TipoFarmaco, String> principioActivo;
    public static volatile SingularAttribute<TipoFarmaco, String> interaccionesFarmacologicas;
    public static volatile SingularAttribute<TipoFarmaco, Integer> idFarmaco;
    public static volatile SingularAttribute<TipoFarmaco, String> viaAdministracion;
    public static volatile SingularAttribute<TipoFarmaco, String> categoria;
    public static volatile SingularAttribute<TipoFarmaco, String> presentacion;
    public static volatile SingularAttribute<TipoFarmaco, String> nombreComercial;
    public static volatile SingularAttribute<TipoFarmaco, String> proporcion;
    public static volatile ListAttribute<TipoFarmaco, Farmacos> farmacosList;

}