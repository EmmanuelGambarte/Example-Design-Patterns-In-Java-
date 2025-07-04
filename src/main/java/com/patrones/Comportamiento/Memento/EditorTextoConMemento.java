package com.patrones.Comportamiento.Memento;

// Originador: el objeto cuyo estado queremos guardar
class EditorTextoConMemento {
    private String contenido = "";

    public void escribir(String texto) {
        contenido += texto;
    }

    public String getContenido() {
        return contenido;
    }

    // Crea un nuevo memento con el estado actual
    public Memento guardar() {
        return new Memento(contenido);
    }

    // Restaura el estado desde un memento
    public void restaurar(Memento memento) {
        this.contenido = memento.getEstado();
    }
}
