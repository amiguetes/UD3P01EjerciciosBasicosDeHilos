package es.cipfpbatoi.dam.psp.ud3;

public class Pokemon extends Thread{

    Thread entrenador;
    public Pokemon(int pokemonNum, Thread entrenador) {
        super(String.format("Pokemon%02d",pokemonNum));
        this.entrenador = entrenador;
    }

    @Override
    public void run() {
        try {
            entrenador.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName());
    }
}
