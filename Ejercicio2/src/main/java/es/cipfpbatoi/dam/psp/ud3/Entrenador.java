package es.cipfpbatoi.dam.psp.ud3;

public class Entrenador extends Thread{
    public Entrenador(int entrenadorNum) {
        super(String.format("Entrenador%02d",entrenadorNum));
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
