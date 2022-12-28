package com.platzi.functional._04_functional;

import java.util.function.Function;
import java.util.function.Predicate;

public class ExampleFunction {

    public static void main(String[] args) {
        /*
        Declarar una funcion utilizando el objeto Function de Java
         */
        Function<Integer, Integer> squareFunction = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x * x;
            }
        };
        System.out.println(squareFunction.apply(5));
        System.out.println(squareFunction.apply(25));
        System.out.println(square(5));

        /*
        Declarar una funcion con el objeto Function de java pero pasandole una lambda
         */
        Function<Integer,Boolean> isOdd = x -> x % 2 ==1;

        /*
        Declarar un Predicado para testear algo, este Predicate solo genera bolleans
         */
        Predicate<Integer> isEven = x -> x % 2 ==0;
        isEven.test(4); //true

        /*
        Utilizando un predicado con un objeto de tipo Student
         */
        Predicate<Student> isApproved = student -> student.getCalificacion() > 6.0;

        Student carlo = new Student(5.0);
        System.out.println(isApproved.test(carlo));
    }

    static class Student{
        private double calificacion;

        Student(double calificacion) {
            this.calificacion = calificacion;
        }
        public double getCalificacion() {
            return calificacion;
        }
    }


    /*
    Declarar una funcion de forma simple
     */
    private static int square(int x){
        return x*x;
    }

}
