package com.javarush.task.task20.task2004;

import java.io.*;

/*
Читаем и пишем в файл статики
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File yourFile = new File("my_file.txt");
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            ClassWithStatic classWithStatic = new ClassWithStatic();
            classWithStatic.i = 3;
            classWithStatic.j = 4;
            classWithStatic.save(outputStream);
            outputStream.flush();
            System.out.println(ClassWithStatic.staticString  + " " + classWithStatic.i + " " + classWithStatic.j);

            ClassWithStatic loadedObject = new ClassWithStatic();
            loadedObject.staticString = "something";
            loadedObject.i = 6;
            loadedObject.j = 7;

            loadedObject.load(inputStream);
            System.out.println();
            System.out.println(ClassWithStatic.staticString  + " " + loadedObject.i + " " + loadedObject.j);

            //here check that the classWithStatic object is equal to the loadedObject object - проверьте тут, что classWithStatic и loadedObject равны

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class ClassWithStatic {
        public static String staticString = "This is a static test string";
        public int i;
        public int j;

        public void save(OutputStream outputStream) throws Exception {
            outputStream.write((this.i + " ").getBytes());
            outputStream.write((this.j + " ").getBytes());
            outputStream.write((ClassWithStatic.staticString + "").getBytes());
        }

        public void load(InputStream inputStream) throws Exception {
            StringBuilder sb = new StringBuilder();
            while (inputStream.available() > 0){
                sb.append((char) inputStream.read());
            }
            String[] array = (sb + "").split(" ");
            this.i = Integer.parseInt(array[0]);
            this.j = Integer.parseInt(array[1]);
            StringBuilder sb1 = new StringBuilder();
            for (int k = 2; k < array.length; k++) {
                sb1.append(array[k]).append(" ");
            }
            ClassWithStatic.staticString = (sb1 + "").trim();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ClassWithStatic that = (ClassWithStatic) o;

            if (i != that.i) return false;
            return j == that.j;

        }

        @Override
        public int hashCode() {
            int result = i;
            result = 31 * result + j;
            return result;
        }
    }
}
