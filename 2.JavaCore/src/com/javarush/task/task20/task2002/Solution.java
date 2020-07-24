package com.javarush.task.task20.task2002;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
Читаем и пишем в файл: JavaRush
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File yourFile = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);


            JavaRush javaRush = new JavaRush();
            User user1 = new User();
            user1.setFirstName("Andrew");
            user1.setLastName("Zubko");
            user1.setMale(true);
            user1.setBirthDate(new Date());
            user1.setCountry(User.Country.RUSSIA);
            javaRush.users.add(user1);
            User user2 = new User();
            user2.setFirstName("Mihail");
            user2.setLastName("Shib");
            user2.setMale(false);
            user2.setBirthDate(new Date());
            user2.setCountry(User.Country.UKRAINE);
            javaRush.users.add(user2);
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //here check that the javaRush object is equal to the loadedObject object - проверьте тут, что javaRush и loadedObject равны

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

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void load(InputStream inputStream) throws Exception {
            StringBuilder sb = new StringBuilder();
            while (inputStream.available() > 0) {
                sb.append((char) inputStream.read());
            }
            String[] wordList = ("" + sb).trim().split(" ");
            if (!(wordList[0].equals("NONE"))) {
                for (int i = 0; i < wordList.length; i += 5) {
                    User user = new User();
                    if (!(wordList[i].equals("null"))) {
                        user.setFirstName(wordList[i]);
                    }

                    if (!(wordList[i + 1].equals("null"))) {
                        user.setLastName(wordList[i + 1]);
                    }

                    if (!(wordList[i + 2].equals("null"))) {
                        long mils = Long.parseLong(wordList[i + 2]);
                        Date date = new Date(mils);
                        user.setBirthDate(date);
                    }

                    if (!(wordList[i + 3].equals("null"))) {
                        boolean male = wordList[i + 3].equals("true") ? true : false;
                        user.setMale(male);
                    }

                    if (!(wordList[i + 4].equals("null"))) {
                        User.Country country;
                        if (wordList[i + 4].equals("Ukraine")) {
                            country = User.Country.UKRAINE;
                        } else if (wordList[i + 4].equals("Russia")) {
                            country = User.Country.RUSSIA;
                        } else {
                            country = User.Country.OTHER;
                        }
                        user.setCountry(country);
                    }
                    users.add(user);
                }
            }

        }

        public void save(OutputStream outputStream) throws Exception {
            if (users.size() > 0) {
                for (User user : users) {
                    outputStream.write((" " + user.getFirstName()).getBytes());
                    outputStream.write((" " + user.getLastName()).getBytes());
                    if (user.getBirthDate() == null){
                        outputStream.write((" " + null).getBytes());
                    } else outputStream.write((" " + user.getBirthDate().getTime()).getBytes());
                    outputStream.write((" " + user.isMale()).getBytes());
                    if (user.getCountry() == null){
                        outputStream.write((" " + null).getBytes());
                    } else outputStream.write((" " + user.getCountry().getDisplayName()).getBytes());
                }
            } else {
                outputStream.write("NONE".getBytes());
            }

        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
