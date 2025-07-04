package com.patrones.Estructurales.Adapter;

// ✅ Clase Adapter: adapta EnchufeEuropeo para que sea compatible con IEnchufeAmericano
public class AdaptadorEuropeo implements IEnchufeAmericano {

    private EnchufeEuropeo enchufeEuropeo;

    // El adaptador recibe una instancia de la clase incompatible
    public AdaptadorEuropeo(EnchufeEuropeo enchufeEuropeo) {
        this.enchufeEuropeo = enchufeEuropeo;
    }

    // Se adapta el método `enchufar()` al método `conectar()` esperado por el
    // cliente
    @Override
    public void conectar() {
        enchufeEuropeo.enchufar();
    }
}
