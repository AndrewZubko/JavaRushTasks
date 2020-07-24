package com.javarush.task.task31.task3101;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/*
Проход по дереву файлов
*/
/*public class Solution {
    ArrayList<File> dirList = new ArrayList<>();
    ArrayList<File> fileList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        Solution solution = new Solution();
//        String path = args[0];
//        String resultFileAbsolutePath = args[1];

//        File file = new File(resultFileAbsolutePath);
        File file = new File("C:\\Users\\andre\\Desktop\\file1.txt");

        String parent = file.getParent();
//        File RenFile = new File(parent + "\\allFilesContent.txt");
        File RenFile = new File(parent + "\\allFilesContent.txt");

        FileUtils.renameFile(file, RenFile);

//        File mainDirFile = new File(path);
        File mainDirFile = new File("C:\\Users\\andre\\Desktop\\New folder");

        solution.SortMethod(mainDirFile);

        while (true) {
            if (!solution.dirList.isEmpty()) {
                solution.SortMethod(solution.dirList.get(0));
                solution.dirList.remove(0);
            } else {
                break;
            }
        }
        ArrayList<String> fileName = new ArrayList<>();
        for (File file1 : solution.fileList) {
            fileName.add(file1.getName());
        }
        Collections.sort(fileName);

        FileOutputStream fileWriter = new FileOutputStream(RenFile, true);
        for (String fName : fileName) {
            Iterator<File> fileIterator = solution.fileList.iterator();
            while (fileIterator.hasNext()){
                File nextFile = fileIterator.next();
                if (nextFile.getName().equals(fName)) {
                    FileInputStream fileReader = new FileInputStream(nextFile);
                    while (fileReader.available() > 0) {
                        fileWriter.write(fileReader.read());
                    }
                    fileWriter.write("\n".getBytes());
                    fileReader.close();
                    fileIterator.remove();
                }
            }
        }
        fileWriter.close();
        System.out.println();

    }


    private void SortMethod(File file) {
        String path = file.getAbsolutePath();
        String[] nameArray = file.list();
        try {
            for (String name : nameArray) {
                File tempFile = new File(path + "\\" + name);
                if (tempFile.isDirectory()) {
                    this.dirList.add(tempFile);
                } else if (tempFile.length() <= 50) {
                    this.fileList.add(tempFile);
                }
            }
        } catch (NullPointerException e) {
        }
    }
}*/
public class Solution {
    private ArrayList<File> fileList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        File directoryPath = new File(args[0]);
        File resultFilePath = new File(args[1]);

        File resultFile = new File(resultFilePath.getParent() + "/allFilesContent.txt");

        FileUtils.renameFile(resultFilePath, resultFile);

        try (FileOutputStream fileOutputStream = new FileOutputStream(resultFile)) {
            Solution solution = new Solution();

            solution.fillFileList(directoryPath.getPath());
            solution.fileList.sort(Comparator.comparing(File::getName));

            for (File file : solution.fileList) {
                try (FileInputStream fileInputStream = new FileInputStream(file)) {
                    while (fileInputStream.available() > 0) {
                        fileOutputStream.write(fileInputStream.read());
                    }

                    fileOutputStream.write(System.lineSeparator().getBytes());
                }
            }
        }
    }

    private void fillFileList(String path) {
        File[] files = new File(path).listFiles();

        for (File file : files) {
            if (file.isDirectory()) {
                fillFileList(file.getAbsolutePath());
            } else if (file.length() > 50) {
                FileUtils.deleteFile(file);
            } else {
                fileList.add(file);
            }
        }
    }
}
