package com.patrones.Estructurales.Proxy;

public class InternetReal implements IServicioInternet {

    // Clase que representa el acceso real a Internet.
    // No realiza ningún tipo de control: simplemente accede a cualquier URL.

    @Override
    public void accederSitio(String url) {
        System.out.println("Accediendo a " + url);
    }
}
