package es.cipfpbatoi.dam.psp.ud3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el número total de Entrenadores y Pokémons (debe ser par):");
        int N = scanner.nextInt();

        // Asegurar que N es par
        if (N % 2 != 0) {
            System.out.println("El número introducido no es par. Por favor, introduce un número par.");
            return;
        }

        Thread threads[] = new Thread[N];

        for (int i = 0; i < N; i += 2) {

            Thread entrenador = new Entrenador(i/2+1);
            Thread pokemon = new Pokemon(i/2+1,entrenador);

            entrenador.start();
            pokemon.start();

            threads[i] = entrenador;
            threads[i+1] = pokemon;

        }

        for (int i = 0; i < N; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

}
