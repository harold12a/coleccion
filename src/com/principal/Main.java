package com.principal;

import java.util.HashSet;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	Propiedad propiedad1 = new Propiedad("cali","valle del cauca ",1500,250);
    Propiedad propiedad2 = new Propiedad("cartagena","bolivar ",2500,350);
    Propiedad propiedad3 = new Propiedad("tulua","valle del cauca ",5000,150);
    Propiedad propiedad4 = new Propiedad("cali","valle del cauca",3500,450);

    Set<Propiedad> propiedadVenta = new HashSet<Propiedad>();
    propiedadVenta.add(propiedad1);
    propiedadVenta.add(propiedad2);
    propiedadVenta.add(propiedad3);
    propiedadVenta.add(propiedad4);

        for (Propiedad propiedad:propiedadVenta) {
            System.out.println("la casa de:  "+propiedad.getUbicacion()
                    +" en el departamento de: " +propiedad.getRegion()
                    +" por valor de: " +propiedad.getValor()
                    +" cuenta con un area de: " +propiedad.getArea()+"mts");
        }
    }
}
