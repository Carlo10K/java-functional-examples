package com.platzi.functional._07_inference;

import com.platzi.functional._06_reference_operator.NombresUtils;

import java.util.List;
import java.util.function.Function;

public class Inferencia {
    public static void main(String[] args) {
        /*
        * java hace la conversion en tiempo de compilacion es por ello que se infieren los tipos de datos
        * no necesitamos definir el tipo estrictamente
         */
        Function<Integer, String> converter =
                integer -> "Al doble:" + (integer *2);

        /*
         * En este caso en la linea 22 definimos directamente el tipo, pero como se puede ver en la linea 23 no es
         * necesario incluso con el operador de referencia no es necesario ni definir la variable
         */
        List<String> alumnos = NombresUtils.getList("Juan", "Hugo", "Paco", "Luis");
        alumnos.forEach((String name) -> System.out.println(name));
        alumnos.forEach(name -> System.out.println(name));
        alumnos.forEach(System.out::println);
    }
}
