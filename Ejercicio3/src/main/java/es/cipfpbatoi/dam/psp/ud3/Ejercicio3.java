package es.cipfpbatoi.dam.psp.ud3;

public class Ejercicio3 {
    public static void main(String[] args) {

        Thread horses[] = new Thread[10];
        System.out.println("Empieza la carrera");

        for (int i = 0; i < horses.length; i++) {

            String nombreCaballo = String.format("Caballo%02d",i+1);

            if (i == 0){
                horses[i] =  new Thread(new ThreadHorse(100,205,5000),nombreCaballo);
            } else if (i == horses.length - 1){
                horses[i] =  new Thread(new ThreadHorse(100,195,5000),nombreCaballo);
            }
            else {
                horses[i] =  new Thread(new ThreadHorse(),nombreCaballo);
            }

        }

        for (Thread horse : horses) {
            horse.start();
        }

        for (Thread horse : horses) {

            try {
                horse.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }
}
