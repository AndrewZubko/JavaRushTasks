package com.javarush.task.task19.task1907;

/* 
Считаем слово
Считаем слово
Считать с консоли имя файла.
Файл содержит слова, разделенные знаками препинания.
Вывести в консоль количество слов "world", которые встречаются в файле.
Закрыть потоки.


Требования:
1. Программа должна считывать имя файла с консоли (используй BufferedReader).
2. BufferedReader для считывания данных с консоли должен быть закрыт.
3. Программа должна считывать содержимое файла (используй FileReader c конструктором принимающим String).
4. Поток чтения из файла (FileReader) должен быть закрыт.
5. Программа должна выводить в консоль количество слов "world", которые встречаются в файле.
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader nameReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = nameReader.readLine();
        nameReader.close();

        String line = "";
        FileReader fileReader = new FileReader(fileName);
        while(fileReader.ready()){
            line += (char)fileReader.read();
        }
        fileReader.close();

        int count = 0;
        int index = line.indexOf(" world");
        if (index != -1){
            int index1 = 0;
            while(index1 != -1){
                count++;
                index1 = line.indexOf(" world", index1 + 2);
            }
        }
        System.out.println(count);
    }
}
