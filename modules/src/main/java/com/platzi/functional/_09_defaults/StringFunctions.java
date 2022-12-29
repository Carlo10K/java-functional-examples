package com.platzi.functional._09_defaults;

public class StringFunctions {
    @FunctionalInterface
    interface  StringOperation{
        int getAmount();

        /*
        Opera con el parametro aqui definido
         */
        default void operate(String text){
            int x = getAmount();
            while(x-- > 0){
                System.out.println(text);
            }
        }
    }

    @FunctionalInterface
    interface  DoOperation{
        void take(String text);

        /*
        Ejecuta operacioens con los parametros aqui definidos
         */
        default void execute(int x, String text){
            while(x-- > 0){
                take(text);
            }
        }
    }


    public static void main(String[] args) {
        /*
        Primero le damos un int que manejara con get Amount en la interface
         */
        StringOperation six = () ->6;

        /*
        Luego llamamos a su metodo default para que realice sus operaciones
         */
        six.operate("Alumno");

        /*
        Le mandamos que funcion debe operar
         */
        DoOperation operateFive = text -> System.out.println(text);

        /*
        luego le mandamos los parametros de execute para que opera con la funcion que le mandamos primero
         */
        operateFive.execute(5,"Juan");
    }
}
