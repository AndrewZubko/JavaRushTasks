package com.javarush.task.task31.task3105;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/* 
Добавление файла в архив
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        String pathToFile = args[0];
        String pathToArchive = args[1];

        Map<String, ByteArrayOutputStream> archivedFiles = new HashMap<>();

        try (ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(pathToArchive))) {
            ZipEntry zipEntry;
            while ((zipEntry = zipInputStream.getNextEntry()) != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

                byte[] buffer = new byte[8 * 1024];
                int len;
                while ((len = zipInputStream.read(buffer)) > 0) {
                    byteArrayOutputStream.write(buffer, 0, len);
                }

                archivedFiles.put(zipEntry.getName(), byteArrayOutputStream);
            }
        }

        Files.delete(Paths.get(pathToArchive));

        try (ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(pathToArchive))) {
            for (Map.Entry<String, ByteArrayOutputStream> pair : archivedFiles.entrySet()) {
                String name = Paths.get(pair.getKey()).getFileName().toString();

                if (name.equals(Paths.get(pathToFile).getFileName().toString())) {
                    zipOutputStream.putNextEntry(new ZipEntry(pair.getKey()));
                    Files.copy(Paths.get(pathToFile), zipOutputStream);
                } else {
                    zipOutputStream.putNextEntry(new ZipEntry(pair.getKey()));
                    zipOutputStream.write(pair.getValue().toByteArray());
                }
            }
        }
    }
}
