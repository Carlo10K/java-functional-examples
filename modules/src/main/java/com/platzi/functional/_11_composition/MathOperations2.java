package com.platzi.functional._11_composition;

import java.util.function.Function;

public class MathOperations2 {
    public static void main(String[] args) {
        /*
        hace una multiplicacion de un numero por 3
         */
        Function<Integer, Integer> multiplyBy3 = x -> {
            System.out.println("Multiplicando x: "+ x + " por 3");
            return x*3;
        };

        /*
        Interfiere en la multiplicacion por 3 de la funcion anterior y le agrega 1 al numero
         */
        Function<Integer, Integer> add1MultiplyBy3 =
                multiplyBy3.compose(y -> {
                    System.out.println("Le agregare 1 a: " + y);
                    return y +1;
                });

        /*
        Ejecuta otra funcion luego de que la anterior se cumpla
         */
        Function<Integer, Integer> andSquare =
                add1MultiplyBy3.andThen(x -> {
                    System.out.println("Estoy elevando "+ x + " al cuadrado");
                    return x * x;
                });

        System.out.println(andSquare.apply(3));
    }
}
