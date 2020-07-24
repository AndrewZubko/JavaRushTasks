package com.javarush.task.task31.task3113;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/* 
Что внутри папки?
*/
public class Solution extends SimpleFileVisitor<Path> {

    private int directionsCount = -1;
    private int filesCount;
    private int totalSize;

    public static void main(String[] args) throws IOException {
        Solution solution = new Solution();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Path dir = Paths.get(reader.readLine());
        reader.close();
        if (Files.isDirectory(dir)){
            Files.walkFileTree(dir, solution);
            solution.printResult();
        } else {
            System.out.println(dir.toAbsolutePath().toString() + " - не папка");
        }
    }

    private void printResult() {
        System.out.format("Всего папок - %d", directionsCount);
        System.out.format("Всего файлов - %d", filesCount);
        System.out.format("Общий размер - %d", totalSize);
    }


    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        filesCount++;
        totalSize += attrs.size();
        return super.visitFile(file, attrs);
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        directionsCount++;
        return super.postVisitDirectory(dir, exc);
    }
}
