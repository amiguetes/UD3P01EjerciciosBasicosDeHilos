package es.cipfpbatoi.dam.psp.ud3;

public class Animal implements Runnable {
    private final String nombre;
    private final int distanciaTotal = 3000; // Distancia total a recorrer: 3km
    private final int paso = 100; // Cada paso es de 100m
    private final int descanso = 100; // Descanso de 100ms entre pasos

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        int distanciaRecorrida = 0;
        while (distanciaRecorrida < distanciaTotal) {
            distanciaRecorrida += paso;
            System.out.println(nombre + " ha recorrido " + distanciaRecorrida + "m");
            try {
                Thread.sleep(descanso);
            } catch (InterruptedException e) {
                System.out.println(nombre + " fue interrumpido.");
            }
        }
        System.out.println(nombre + " ha finalizado la carrera.");
    }
}
