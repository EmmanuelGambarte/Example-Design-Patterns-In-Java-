package com.patrones.Comportamiento.Memento;

// =============================
// ❌ Sin aplicar el patrón Memento
// =============================
class EditorTexto {
    private String contenido = "";

    public void escribir(String texto) {
        contenido += texto;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String estadoAnterior) {
        this.contenido = estadoAnterior;
    }
}
