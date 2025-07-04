package com.patrones.Estructurales.Proxy;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== ❌ Sin aplicar Proxy ===");

        // El cliente accede directamente al objeto real sin control de acceso.
        IServicioInternet sinProxy = new InternetReal();
        sinProxy.accederSitio("www.google.com");
        sinProxy.accederSitio("www.sitioprohibido.com");

        System.out.println("----------/////////////////------------------");

        System.out.println("=== ✅ Aplicando Proxy ===");

        // El cliente ahora accede a través del proxy, que filtra los sitios prohibidos.
        IServicioInternet conProxy = new ProxyInternet();
        conProxy.accederSitio("www.google.com");
        conProxy.accederSitio("www.sitioprohibido.com");
    }
}
