package com.javarush.task.task14.task1414;

/* 
MovieFactory
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.BufferOverflowException;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String film = reader.readLine();
            if (film.equals("soapOpera") || film.equals("cartoon") || film.equals("thriller")) {
                System.out.println();
               MovieFactory.print(MovieFactory.getMovie(film));
            }
            else {
                MovieFactory.getMovie(film);
                break;
            }
        }

        reader.close();

        /*
8 Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1 получить объект используя MovieFactory.getMovie и присвоить его переменной movie
8.2 вывести на экран movie.getClass().getSimpleName()
        */

    }

    static class MovieFactory {

        static void print(Movie movie){
            System.out.println(movie.getClass().getSimpleName());
        }

        static Movie getMovie(String key) {
            Movie movie = null;

            //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            }

            else if ("cartoon".equals(key)) {
                movie = new Cartoon();
            }

            else if ("thriller".equals(key)) {
                movie = new Thriller();
            }

//            else {
//                System.out.println(key);
//            }
            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    static class Cartoon extends Movie{}

    static class Thriller extends Movie{}
}
