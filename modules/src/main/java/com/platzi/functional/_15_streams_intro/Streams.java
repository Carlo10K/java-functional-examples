package com.platzi.functional._15_streams_intro;

import com.platzi.functional._06_reference_operator.NombresUtils;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<String> courseList = NombresUtils.getList(
                "Java",
                "FrontEnd",
                "BackEnd");

        /*
        Haciendo una lista de cursos
         */
        Stream<String> coursesStream = Stream.of("Java",
                "FrontEnd",
                "BackEnd");

        /*
        Consumiendo el stream para retornar un Stream con el length de cada curso
         */
        Stream<Integer> courseLengthStream = coursesStream.map(course -> course.length());

        /*
        Obteniendo el curso mas largo
         */
        Optional<Integer> longest = courseLengthStream.max((x, y) -> y - x);

        /*
        mapeando cada curso para agregar un !
         */
        Stream<String> emphasisCourses = coursesStream.map(course -> course + "!");

        /*
        Verificando si cada curso contienen "Java"
         */
        Stream<String> justJavaCourse = coursesStream.filter(course -> course.contains("Java"));

        /*
        imprimimendo
         */
        emphasisCourses.forEach(System.out::println);

        /*
        Este codigo falla ya que los estreams solo se pueden consumir una vez, en este carso coursesStream esta siendo
        consumido cuando sacamos el lenght, y cuando queremos hacerle un map ya no funciona.
        */

        /*
        Para arreglar este problema podemos hacer chaining
         */
        Stream<String> coursesStream2 = courseList.stream();
        coursesStream2.map(course -> course + "!!")
                .filter(course -> course.contains("Java"))
                .forEach(System.out::println);


        /*
        Podemos usar funciones para que pueda operar sobre el
         */
        Stream<String> coursesStream3 = courseList.stream();
        addOperator(
                coursesStream3.map(course -> course + "!!")
                        .filter(course -> course.contains("Javava"))
        ).forEach(System.out::println);
    }

    static <T> Stream<T> addOperator(Stream<T> stream) {
        return stream.peek(data -> System.out.println("Dato: " + data));
    }
}
