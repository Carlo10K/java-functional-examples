package com.platzi.functional._10_chaining;

public class ChainingExample {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        //creando un String a partir de String Builder ya que cada append retorna un string en cada iteracion
        stringBuilder
                .append("hola")
                .append("alumno")
                .append("jejeje");

        Chainer chainer = new Chainer();
        //haciendo chaining de los metodos porque retornan un objeto chainer en cada iteracion
        chainer.sayHi().sayBye().sayHi().sayBye();

        //haciendo chaining para diferentes metodos
        Chainer chainer1 = chainer.sayHi();
        Chainer chainer2 = chainer1.sayBye();
    }

    static class Chainer {
        public Chainer sayHi(){
            System.out.println("Hola");
            return this;
        }

        public Chainer sayBye(){
            System.out.println("Bye");
            return this;
        }
    }
}
