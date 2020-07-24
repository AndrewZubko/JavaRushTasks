package com.javarush.task.task31.task3102;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* 
Находим все файлы
*/
public class Solution {
    public static List<String> getFileTree(String root) throws IOException {
        List<String> nameList = new ArrayList<>();
        ArrayList<File> dirList = new ArrayList<>();
        File mainDir = new File(root);
        dirList.add(mainDir);

        while (true) {
            if (!dirList.isEmpty()) {
                File[] files = dirList.get(0).listFiles();

                for (File file : files) {
                    if (file.isDirectory()) {
                        dirList.add(file);
                    } else {
                        nameList.add(file.getAbsolutePath());
                    }
                }
                dirList.remove(0);
            } else {
                break;
            }

        }
        return nameList;

    }

    public static void main(String[] args) throws IOException {
        List<String> names = getFileTree("C:\\Users\\andre\\Desktop\\New folder");
        for (String s : names) {
            System.out.println(s);
        }
    }
}
