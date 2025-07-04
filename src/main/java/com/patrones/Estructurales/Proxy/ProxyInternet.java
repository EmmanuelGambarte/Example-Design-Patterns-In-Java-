package com.patrones.Estructurales.Proxy;

import java.util.Arrays;
import java.util.List;

// Proxy que actúa como intermediario entre el cliente y el objeto real.
// Controla el acceso a ciertos sitios bloqueados antes de delegar al objeto real.
public class ProxyInternet implements IServicioInternet {

    private InternetReal internetReal = new InternetReal();

    // Lista de sitios bloqueados.
    private static final List<String> sitiosBloqueados = Arrays.asList(
            "www.sitioprohibido.com",
            "www.malware.com");

    @Override
    public void accederSitio(String url) {
        if (sitiosBloqueados.contains(url.toLowerCase())) {
            System.out.println("⚠️ Acceso denegado a " + url);
        } else {
            internetReal.accederSitio(url);
        }
    }
}