package com.javarush.task.task31.task3112;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/* 
Загрузчик файлов
*/
public class Solution {

    public static void main(String[] args) throws IOException {
        Path passwords = downloadFile("https://javarush.ru/testdata/secretPasswords.txt", Paths.get("D:/MyDownloads"));

        for (String line : Files.readAllLines(passwords)) {
            System.out.println(line);
        }
    }

    public static Path downloadFile(String urlString, Path downloadDirectory) throws IOException {
        /*URL url = new URL(urlString);
        InputStream inputStream = url.openStream();
        Path directory = Files.createDirectory(downloadDirectory);

        Path tempFile = Files.createTempFile("temp-",".tmp");
        Files.copy(inputStream, tempFile, StandardCopyOption.REPLACE_EXISTING);
        inputStream.close();

        String[] array = urlString.split("/");
        String fileName = array[array.length - 1];
        Path file = Paths.get(directory + "/" + fileName);


        Files.copy(tempFile, file);

        return file;*/
        URL url = new URL(urlString);
        Path fileName = Paths.get(url.getPath()).getFileName();
        Path fileDir = Paths.get(String.valueOf(downloadDirectory));
        InputStream inputStream = url.openStream();
        Path tempFile = Files.createTempFile("temp-", ".txt");
        Files.copy(inputStream, tempFile, StandardCopyOption.REPLACE_EXISTING);
        String separator = "/";
        Path newName = Paths.get(fileDir.toString() + separator + fileName.toString());
        downloadDirectory = Files.move(tempFile, newName, StandardCopyOption.REPLACE_EXISTING);
        return downloadDirectory;



    }
}
