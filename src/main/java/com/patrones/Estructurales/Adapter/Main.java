package com.patrones.Estructurales.Adapter;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        // ❌ Sin aplicar el patrón Adapter: no se puede usar EnchufeEuropeo directamente
        EnchufeEuropeo europeo = new EnchufeEuropeo();
        // cliente.usar(europeo); // Esto no compila porque EnchufeEuropeo no implementa
        // IEnchufeAmericano

        // ✅ Aplicando el patrón Adapter
        IEnchufeAmericano adaptador = new AdaptadorEuropeo(europeo);

        // Ahora el cliente puede usar el enchufe europeo como si fuera americano
        cliente.usar(adaptador);
    }
}
