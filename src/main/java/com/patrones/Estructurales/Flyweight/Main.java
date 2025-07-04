package com.patrones.Estructurales.Flyweight;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Sin aplicar Flyweight ===");
        // Creamos cada objeto Letra con toda la info, sin reutilizar
        Letra l1 = new Letra('H', 1, 1);
        Letra l2 = new Letra('E', 2, 1);
        Letra l3 = new Letra('L', 3, 1);
        Letra l4 = new Letra('L', 4, 1);
        Letra l5 = new Letra('O', 5, 1);

        l1.mostrar();
        l2.mostrar();
        l3.mostrar();
        l4.mostrar();
        l5.mostrar();

        System.out.println("----------/////////////////------------------");
        FlyweightFactory factory = new FlyweightFactory();

        // Solicitamos objetos letra al factory y reutilizamos instancias
        ILetra fl1 = factory.getLetra('H');
        ILetra fl2 = factory.getLetra('E');
        ILetra fl3 = factory.getLetra('L');
        ILetra fl4 = factory.getLetra('L'); // Reutiliza el mismo objeto que 'L'
        ILetra fl5 = factory.getLetra('O');

        // Pasamos la posición como estado extrínseco al mostrar
        fl1.mostrar(1, 1);
        fl2.mostrar(2, 1);
        fl3.mostrar(3, 1);
        fl4.mostrar(4, 1);
        fl5.mostrar(5, 1);
    }
}