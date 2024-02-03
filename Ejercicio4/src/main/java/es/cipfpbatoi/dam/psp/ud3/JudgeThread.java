package es.cipfpbatoi.dam.psp.ud3;

import java.util.Random;

public class JudgeThread implements Runnable{

    private final Thread[] caballos;
    private static final int DESCALIFICACIONES_MAX = 5;
    private final Random random = new Random();

    public JudgeThread(Thread[] caballos){
        this.caballos = caballos;
    }

    @Override
    public void run() {
        int descalificaciones = 0;
        while (descalificaciones < DESCALIFICACIONES_MAX) {
            int index = random.nextInt(caballos.length);
            Thread caballo = caballos[index];

            if (!caballo.isInterrupted() && caballo.isAlive()) {
                caballo.interrupt();
                descalificaciones++;
                System.out.println(caballo.getName() + " ha sido descalificado por el juez. Total descalificados: " + descalificaciones);
                try {
                    // Espera un tiempo antes de la próxima descalificación
                    Thread.sleep(random.nextInt(1000) + 500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
