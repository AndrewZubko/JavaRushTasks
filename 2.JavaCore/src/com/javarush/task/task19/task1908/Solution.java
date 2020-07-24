package com.javarush.task.task19.task1908;

/* 
Выделяем числа
Считать с консоли 2 имени файла.
Вывести во второй файл все числа, которые есть в первом файле.
Числа выводить через пробел.
Закрыть потоки.

Пример тела файла:
12 text var2 14 8ю 1

Результат:
12 14 1


Требования:
1. Программа должна считывать имена файлов с консоли (используй BufferedReader).
2. BufferedReader для считывания данных с консоли должен быть закрыт.
3. Программа должна считывать содержимое первого файла (используй BufferedReader c конструктором принимающим FileReader).
4. Поток чтения из файла (BufferedReader) должен быть закрыт.
5. Программа должна записывать во второй файл все числа, через пробел, из первого файла (используй BufferedWriter с конструктором FileWriter).
6. Поток записи в файл (BufferedWriter) должен быть закрыт.
*/

import java.io.*;
import java.lang.reflect.Array;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static boolean isDig;
    public static void main(String[] args) throws IOException {
        BufferedReader nameReader = new BufferedReader(new InputStreamReader(System.in));
        String firstName = nameReader.readLine();
        String secondName = nameReader.readLine();
        nameReader.close();

        String line = "";
        BufferedReader fileReader = new BufferedReader(new FileReader(firstName));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(secondName));

        while(fileReader.ready()){
            line += fileReader.readLine();
        }

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, line.split(" "));

        for (String s : list){
            if (isDigit(s)){
                fileWriter.write(s + " ");
            }
        }

        fileReader.close();
        fileWriter.close();

    }

    public static boolean isDigit(String s){
        try{
            Integer.parseInt(s);
            return true;
        }
        catch (NumberFormatException e){
            return false;
        }

    }
}
