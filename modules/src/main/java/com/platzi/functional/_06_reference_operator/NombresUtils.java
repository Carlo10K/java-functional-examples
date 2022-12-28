package com.platzi.functional._06_reference_operator;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class NombresUtils {

    public static void main(String[] args) {
        /*
        ayudandonos con la funcion getList generamos una lista de nombres
         */
        List<String> profesores = getList("Nicolas", "Juan", "Zulema");

        /*
        utilizando lambda para impmresion de cada uno utilizando un consumer propio
         */
        Consumer<String> printer = text -> System.out.println(text);
        profesores.forEach(printer);

        /*
        utilizando el operador de referencia para utilizar el metodo println del sistema
         */
        profesores.forEach(System.out::println);
    }

    /*
    Funcion que nos servira para generar una lista de elementos que pasemos como parametros, no importando la cantidad
     */
    public static <T> List<T> getList(T ... elements){
        return Arrays.asList(elements);
    }
}
