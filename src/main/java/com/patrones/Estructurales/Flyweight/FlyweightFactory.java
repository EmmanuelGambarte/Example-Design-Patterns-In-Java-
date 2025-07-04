package com.patrones.Estructurales.Flyweight;

import java.util.HashMap;

public class FlyweightFactory {
    private HashMap<Character, ILetra> letras = new HashMap<>();

    public ILetra getLetra(char caracter) {
        ILetra letra = letras.get(caracter);
        if (letra == null) {
            letra = new LetraConcreta(caracter);
            letras.put(caracter, letra);
            System.out.println("Creando objeto letra para '" + caracter + "'");
        }
        return letra;
    }
}
