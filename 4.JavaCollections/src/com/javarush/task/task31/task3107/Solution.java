package com.javarush.task.task31.task3107;

import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
Null Object Pattern
*/
public class Solution {
    private FileData fileData;

    public Solution(String pathToFile) {
        try{
            Path temp = Paths.get(pathToFile);
            fileData = new ConcreteFileData(Files.isHidden(temp),Files.isExecutable(temp), Files.isDirectory(temp), Files.isWritable(temp));
        } catch (Exception e) {
            fileData = new NullFileData(e);
        }
    }

    public FileData getFileData() {
        return fileData;
    }
}
