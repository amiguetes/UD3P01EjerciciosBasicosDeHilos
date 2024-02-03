package es.cipfpbatoi.dam.psp.ud3;

public class Main {
    public static void main(String[] args) {
        Animal tortuga1 = new Animal("Tortuga1");
        Animal tortuga2 = new Animal("Tortuga2");
        Animal tortuga3 = new Animal("Tortuga3");
        Animal tortuga4 = new Animal("Tortuga4");
        Animal conejo1 = new Animal("Conejo1");
        Animal conejo2 = new Animal("Conejo2");
        Animal conejo3 = new Animal("Conejo3");
        Animal guepardo = new Animal("Guepardo");

        Thread t1 = new Thread(tortuga1);
        Thread t2 = new Thread(tortuga2);
        Thread t3 = new Thread(tortuga3);
        Thread t4 = new Thread(tortuga4);
        Thread c1 = new Thread(conejo1);
        Thread c2 = new Thread(conejo2);
        Thread c3 = new Thread(conejo3);
        Thread g = new Thread(guepardo);

        /*

        FIXME: ¿Hacer que los animales lleguen primero?

        No podemos tener la certeza de que las prioridades van a funcionar,
        por tanto, la única manera de hacer que un animal llegue antes que otro
        es modificando la velocidad.

         */

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        c1.start();
        c2.start();
        c3.start();
        g.start();
    }
}