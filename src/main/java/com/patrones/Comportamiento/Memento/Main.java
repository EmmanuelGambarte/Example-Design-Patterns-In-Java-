package com.patrones.Comportamiento.Memento;

public class Main {
    public static void main(String[] args) {

        // ------------------------------
        System.out.println("=== ❌ Sin aplicar Memento ===");
        EditorTexto editor = new EditorTexto();
        editor.escribir("Hola");
        String backup = editor.getContenido(); // guardar manualmente

        editor.escribir(" Mundo");
        System.out.println("Contenido actual: " + editor.getContenido());

        // Deshacer manual
        editor.setContenido(backup);
        System.out.println("Después de deshacer: " + editor.getContenido());

        // ------------------------------
        System.out.println("\n=== ✅ Aplicando patrón Memento ===");
        EditorTextoConMemento editorConMemento = new EditorTextoConMemento();
        Historial historial = new Historial();

        editorConMemento.escribir("Hola");
        historial.guardarEstado(editorConMemento.guardar()); // snapshot

        editorConMemento.escribir(" Mundo");
        System.out.println("Contenido actual: " + editorConMemento.getContenido());

        editorConMemento.restaurar(historial.deshacer());
        System.out.println("Después de deshacer: " + editorConMemento.getContenido());
    }
}