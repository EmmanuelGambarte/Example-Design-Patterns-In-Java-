package com.patrones.Comportamiento.Observer;

// Interfaz Observable (o Sujeto)
interface ISujeto {
    void registrar(IObservador o);

    void remover(IObservador o);

    void notificarObservadores();
}