package es.cipfpbatoi.dam.psp.ud3;

public class Ejercicio4 {
    public static void main(String[] args) {

        Thread horses[] = new Thread[10];
        System.out.println("Empieza la carrera");
        for (int i = 0; i < horses.length; i++) {

            String nombreCaballo = String.format("Caballo%02d",i);
            ThreadHorse caballo = new ThreadHorse();

            horses[i] =  new Thread(caballo,nombreCaballo);

        }

        Thread judge = new Thread(new JudgeThread(horses));

        for (Thread horse : horses){
            horse.start();
        }

        judge.start();

        for (Thread horse: horses) {
            try {
                horse.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        try {
            judge.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
