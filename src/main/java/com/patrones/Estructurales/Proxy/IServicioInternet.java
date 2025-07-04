package com.patrones.Estructurales.Proxy;

// Interface que define el contrato para acceder a un sitio web.
// Tanto la clase real como el proxy deben implementar esta interfaz.
public interface IServicioInternet {

    void accederSitio(String url);

}
