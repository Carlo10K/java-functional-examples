package com.platzi.functional._08_lambda;

import com.platzi.functional._06_reference_operator.NombresUtils;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Sintaxis{
    public static void main(String[] args) {
        List<String> cursos = NombresUtils.getList("Java","Functional");

        /*
        Lambda que recibe un parametro
         */
        cursos.forEach(curso -> System.out.println(curso));

        /*
        Lambda que recibe 2 parametros y retorna
         */
        BiFunction<Integer, Integer, Integer> s = (x,y)->x*y;

        /*
        Lambda que no recibe parametros pero retorna
         */
        useZero(()-> 2);

        /*
        Lambda que retorna un bool para un predicate
         */
        usarPredicado(text -> text.isEmpty());

        /*
        Lambda que utiliza una biFunction
         */
        usarBiFunction((x,y)-> x*y);

        /*
        Lambda que utiliza biFunction pero con mas operaciones
         */
        usarBiFunction((x,y) ->{
            System.out.println("X: " + x + ", Y:" +y);
            return x-y;
        });

        /*
        Lambda que no recibe nada y no retorna nada
         */
        usarNada(() -> {
            System.out.println("hey");
        });

    }

    static void usarBiFunction(BiFunction<Integer, Integer, Integer> operator){};

    static void usarPredicado(Predicate<String> predicate){}

    static void useZero(ZeroArgs zeroArgs){}

    static void usarNada(Nothing nothing){}

    @FunctionalInterface
    interface  ZeroArgs{
        int get();
    }

    @FunctionalInterface
    interface Nothing {
        void nada();
    }

}
