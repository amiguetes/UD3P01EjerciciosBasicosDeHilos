package es.cipfpbatoi.dam.psp.ud3;

public class Ejercicio1 {

    public static void main(String[] args) {

        Thread horses[] = new Thread[10];
        System.out.println("Empieza la carrera");
        for (int i = 0; i < horses.length; i++) {

            String nombreCaballo = String.format("Caballo%02d",i);
            ThreadHorse caballo = new ThreadHorse();

            horses[i] =  new Thread(caballo,nombreCaballo);
            horses[i].start();

        }

        for (int i = 0; i < horses.length; i++) {

            try {
                horses[i].join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }


    }

}
