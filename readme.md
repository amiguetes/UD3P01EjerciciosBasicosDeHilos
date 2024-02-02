# PRÁCTICA 1  - EJERCICIOS BÁSICOS DE HILOS

Escribe en Java los programas necesarios:

* Utiliza de manera adecuada la Programación Orientada a Objetos.
* Presta atención a las excepciones que pueda originar el código e informa al usuario.
* Imprime en pantalla los mensajes necesarios cuando haya que informar al usuario.
* No olvides comentar el código.

Contenido

* [1. Ejercicio 1: Carrera de Caballos](#1-ejercicio-1-carrera-de-caballos)
* [2. Ejercicio 2: Entrenadores y Pokémons](#2-ejercicio-2-entrenadores-y-pokémons)
* [3. Ejercicio 3: Carrera *chetada* de Caballos](#3-ejercicio-3-carrera-chetada-de-caballos)
* [4. Ejercicio 4: Carrera de Caballos Interrumpida. No hay piedad para los tramposos](#4-ejercicio-4-carrera-de-caballos-interrumpida-no-hay-piedad-para-los-tramposos)
* [5. Ejercicio 5: Carrera de Animales](#5-ejercicio-5-carrera-de-animales)

## 1. Ejercicio 1: Carrera de Caballos

¿Es cierto que cada thread se ejecuta independientemente y asíncorono? ¿Qué opinas?
¿El primero finalizará primero, el segundo segundo, ...?

Vamos a realizar una prueba interesante de programación: La Carrera de Caballos.

Escribe un programa que que arranque 10 instancias de la clase ThreadHorse. Cada thread tendrá un nombre del tipo: “CaballoXX” cuando se crea. Cada caballo ha de completar una distancia de 5km en pasos de 100 metros con descansos de 200ms en cada paso. En cada paso se imprime la distancia para finalizar: “Caballo XX: 4500m para finalizar” Cuando un Caballo completa los 5 Km de distancia imprime “Caballo XX: Ha Finalizado”.

* ¿Quien llegará primero? Realizad vuestras apuestas.
* Realiza la implementación utilizando la clase **Thread** y implementando la interfaz **Runnable**.
* Reflexiona sobre los resultados.

## 2. Ejercicio 2: Entrenadores y Pokémons

> Cuánto les gustan los pokémons a los niños?.
> Hagamos que cada pokémon siga a su entrenador.

Escribe un programa que crea N/2 PokemonThread y N/2 TrainerThread ( pregunta al usuario por el número par N).

* Cada número impar será un Pokémon y cada número par será un entrenador.
* Los hilos imprimen mensajes basados en su tipo: "Soy el Pokémon número X" o "Soy el Entrenador número X"

Tienes que arrancar todos los hilos, pero forzando que todos los Pokémons muestren su mensaje después de su correspondiente entrenador.

## 3. Ejercicio 3: Carrera *chetada* de Caballos

Imagina que puedes manipular la forzaleza de los caballos antes de que empiece la carrera. Estarías dando comienzo a la carrera *chetada* de caballos. ¡No sería una carrera justa!

* Modifica el ejercicio 1 para hacer que el último ThreadHorse llegue en los primeros lugares y que el primer ThreadHorse llegue en en los últimos.
* Ejecuta el programa.
* Revisa y analiza el resultado obtenido. Escribe tus conclusiones.

## 4. Ejercicio 4: Carrera de Caballos Interrumpida. No hay piedad para los tramposos

Ahora imagina que hay un juez que aleatoriamente descalifica caballos que están haciendo trampas ( u otras acciones castigables). Si es el caso, esos caballos jamás finalizarán la carrera.

* Modifica Ejercicio 1 para incluir el juez (llámalo *JudgeThread*) que aleatoriamente impedirá que 5 *ThreadHorse* finalicen la carrera (descalificados):
    * Usa constantes para todos los valores que necesites.
    * **Juez**: Descalifica un caballo cada cierto intervalo( e imprime un mensaje ) y sólo descalifica caballos que actualmente estén en ejecución. Cuando descalifica, imprime un mensaje con el número total de caballos descalificados.
    * Un caballo descalificado imprime un mensaje e inmediatamente abandona la carrera. No puede volver a ser descalificado por el juez.
* Prueba el programa utilizando diferentes valores en las constantes ( mira que ocurre si el juez es rápido - o lento - buscando a tramposos).
* Analiza los resultados obtenidos y escribe tus conclusiones.

## 5. Ejercicio 5: Carrera de Animales

* Desarrolla un programa donde definas la clase *Animal* y crea las siguientes instancias de *Animal*: 4 tortugas, 3 conejos y guepardo.
* Arranca un hilo para cada animal. Cada animal debe recorrer una distancia de 3 km en incrementos de 100m y descansar 100ms. En cada incremento, imprime el nombre del animal y la distancia completada. Cuando una animal finaliza la carrera, imprime un mensaje indicándolo.
    * Ejecuta el programa varias veces. ¿Los animales más rápidos llegan siempre los primeros? ¿Por qué?
* Modifica el programa anterior para hacer que los animales más rápidos lleguen **siempre** en primeras posiciones. Prueba diferentes opciones para solucionar el problema. Comprueba los resultados y escribe tus conclusiones.
