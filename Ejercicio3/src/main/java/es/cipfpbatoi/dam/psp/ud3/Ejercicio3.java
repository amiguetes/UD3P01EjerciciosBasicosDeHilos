package es.cipfpbatoi.dam.psp.ud3;

public class Ejercicio3 {
    public static void main(String[] args) {
        Thread horses[] = new Thread[10];
        System.out.println("Empieza la carrera");
        for (int i = 0; i < horses.length; i++) {

            String nombreCaballo = String.format("Caballo%02d",i+1);

            if (i == 0){
                horses[i] =  new Thread(new ThreadHorse(50,200,500),nombreCaballo);
            } else if (i == horses.length - 1){
                horses[i] =  new Thread(new ThreadHorse(300,200,500),nombreCaballo);
            }
            else {
                horses[i] =  new Thread(new ThreadHorse(),nombreCaballo);
            }

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
