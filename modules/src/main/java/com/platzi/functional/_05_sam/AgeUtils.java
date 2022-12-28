package com.platzi.functional._05_sam;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

public class AgeUtils {

    public static void main(String[] args) {
        /*
        BiFunction que toma un Integer y lo convierte a String si este menor a 10 le agrega un cero y si no unicamente lo convierte
         */
        Function<Integer, String> addCeros = x -> x < 10 ? "0" + x : String.valueOf(x);

        /*
        Funcion que utiliza la interfaz Trifunction que creamos para parsear una fecha
         */
        TriFunction<Integer,Integer,Integer, LocalDate> parseDate =
                (day, month, year) -> LocalDate.parse(year + "-" + addCeros.apply(month) +"-" + addCeros.apply(day));

        /*
        TriFunction que mediante parseDate, obtiene la cantidad de años entre los parametros ingresados y la actual
         */
        TriFunction<Integer, Integer, Integer, Integer> calculateAge =
                (day,moth,year) -> Period.between(
                       parseDate.apply(day,moth,year),  LocalDate.now()
                        ).getYears();

        System.out.println(calculateAge.apply(1,10,1992));
    }

    /*
    Interfaz que nos ayuda a crear TriFunctions
     */
    @FunctionalInterface
    interface TriFunction<T,U,V,R>{
        R apply(T t, U u, V v);
    }
}
