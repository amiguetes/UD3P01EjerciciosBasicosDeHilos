package es.cipfpbatoi.dam.psp.ud3;

public class ThreadHorse implements Runnable{

    private final int DISTANCIA_TOTAL_METROS; // Distancia en metros
    private final int PASO_METROS ; // Cada paso en metros
    private final int DESCANSO_MS; // Descanso de entre pasos

    public ThreadHorse(int paso,int descanso,int distanciaTotal){
        this.PASO_METROS = paso;
        this.DESCANSO_MS = descanso;
        this.DISTANCIA_TOTAL_METROS = distanciaTotal;
    }

    public ThreadHorse(){
        this(100,200,5000);
    }

    public void run() {
        int distanciaRestante = DISTANCIA_TOTAL_METROS;

        while (distanciaRestante > 0) {
            distanciaRestante -= PASO_METROS;

            //System.out.println(Thread.currentThread().getName() + ": " + distanciaRestante + "m para finalizar");

            try {
                Thread.sleep(DESCANSO_MS);
            } catch (InterruptedException e){
                System.out.println(Thread.currentThread().getName() + " fue interrumpido.");
                return;

            }
        }

        System.out.println(Thread.currentThread().getName() + ": Ha Finalizado");

    }
}
