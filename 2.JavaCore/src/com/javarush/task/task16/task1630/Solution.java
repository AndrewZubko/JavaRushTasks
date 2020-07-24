package com.javarush.task.task16.task1630;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;


    static {
        Scanner in = new Scanner(System.in);
        firstFileName = in.nextLine();
        secondFileName = in.nextLine();
        in.close();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface{
        String fileName;
        String fileContent = "";

        @Override
        public void run() {
            try {
                FileReader reader = new FileReader(this.fileName);
                Scanner scanner = new Scanner(reader);
                while(scanner.hasNextLine()){
                    this.fileContent = fileContent + scanner.nextLine() + " ";
                }
            }
            catch (IOException e){}
        }

        @Override
        public void setFileName(String fullFileName) {
            this.fileName = fullFileName;
        }

        @Override
        public String getFileContent() {
            return this.fileContent;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    //add your code here - добавьте код тут
}
