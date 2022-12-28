package com.platzi.functional._04_functional;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class StringFunctions {
    public static void main(String[] args) {
        /*
        UnaryOperator trabaja sobre un mismo tipo de elemnto en este caso String
         */
        UnaryOperator<String> quote = text -> "\"" + text + "\"";
        UnaryOperator<String> addMark = text -> text +"!";

        System.out.println(quote.apply("Hola"));
        System.out.println(addMark.apply("Hola"));

        /*
        2 parametros de entrada, y 1 tipo de salida, cada uno puede ser de cualquier tipo
         */
        BiFunction<Integer,Integer,Integer> multiplicacionConBiFunction = (x,y)-> x*y;
        multiplicacionConBiFunction.apply(5,4);

        /*
        Se especifica solo 1 tipo de dato, pensado para que los 2 parametros de entrada y salida sean del mismo tipo
         */
        BinaryOperator<Integer> multipliacionConBinaryOperator =(x,y)->x*y;
        multipliacionConBinaryOperator.apply(5,4);

        /*
        Funcion para agregar espacios a la izquierda a un string para llegar al numero de caracteres que le mandamos en
        number, para decir que son espacios usamos "s" en String.format
         */
        BiFunction<String, Integer, String> leftPad = (text, number) -> String.format("%" + number + "s", text);
        System.out.println(leftPad.apply("Java", 10));

        /*
        Entonces podemos crear una lista de BiFunctions que ejecutaran la logica sobre algun String.
         */
        List<BiFunction<String, Integer, String>> formateadores;

    }
}
