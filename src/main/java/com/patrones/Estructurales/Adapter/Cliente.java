package com.patrones.Estructurales.Adapter;

// ✅ Clase cliente que espera objetos que implementen la interfaz IEnchufeAmericano
public class Cliente {
    public void usar(IEnchufeAmericano enchufeAmericano) {
        enchufeAmericano.conectar();
    }
}